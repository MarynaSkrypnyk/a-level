package src.reflection.skrypnyk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class PersonFactory {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        Person person = createPerson("First",1,"Lviv");
        Person personSecond = createPerson("Second",2,"Kyiv");

        printFields(person);
        System.out.println();
        printFields(personSecond);

    }
    public static Person createPerson(String name, int age, String address) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        try {
            Constructor <Person> constructor = Person.class.getConstructor(String.class,int.class,String.class);
            return constructor.newInstance(name,age,address);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printFields(Person person) throws IllegalAccessException {
        Class<? extends Person> personInfo = person.getClass();
        Field [] fieldName = personInfo.getDeclaredFields();
        for (Field declaredField : fieldName) {
            declaredField.setAccessible(true);


            System.out.println(declaredField.getName() + ": " + declaredField.get(person));

        }
    }
}



