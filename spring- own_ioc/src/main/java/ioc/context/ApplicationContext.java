package ioc.context;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import lombok.SneakyThrows;

import java.util.*;

public class ApplicationContext {
    private Map<String, Object> context;
    private final String scanningPackageName;

    public ApplicationContext(String scanningPackageName) {
        this.scanningPackageName = scanningPackageName;
        this.context = resolveComponent();
    }
    public Object getComponent(String componentName){
        return context.get(componentName);
    }
    public <T> T getComponent (String componentName, Class <T> requiredType){
        return (T) getComponent(componentName);
    }
    public List<Object> getPresentComponents(){
        return new ArrayList<>(context.values());
    }
    @SneakyThrows
    private Map<String, Object> resolveComponent() {
        Set <String> classNames = new HashSet<>();
        Map<String, Object> components = new HashMap<>();
         try(ScanResult scanResult = new ClassGraph()
                 .whitelistPackages(scanningPackageName)
                 .scan()){
             for (ClassInfo classInfo: scanResult.getAllClasses()){
                 classNames.add(classInfo.getName());
             }
         }
         for (String className: classNames){
             try {
                 Object object = Class.forName(className).getConstructor().newInstance();
                 if (object.getClass().isAnnotationPresent(Component.class)) {
                     String beanName = object.getClass().getAnnotation(Component.class).name();
                     components.put(beanName, object);
                 }
             } finally {

             }
         }
        return components;
    }
}
