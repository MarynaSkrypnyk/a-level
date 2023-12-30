package src.reflection.skrypnyk;

import javax.xml.namespace.QName;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        Student student = new Student("Maria", "Okko", 18, 2, 26);
        printStudentInfo(student);
    }

    public static void printStudentInfo(Student student) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String printStudentInfo = "";
        Class<? extends Student> studentInfo = student.getClass();
        Field[] declaredFields = studentInfo.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            boolean annotationPresent = declaredField.isAnnotationPresent(ShowInfo.class);
            if (annotationPresent) {
                printStudentInfo += declaredField.get(student);
            }
        }
                Method grade = studentInfo.getDeclaredMethod("passExamSuccessfully");
                grade.setAccessible(true);
                grade.invoke(student,null);

        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student new grade: " + student.getExamScore());
    }
}
