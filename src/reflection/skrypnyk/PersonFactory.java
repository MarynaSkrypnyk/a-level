package src.reflection.skrypnyk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class PersonFactory {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        printFields(new Person("Name", 82, "Lviv"));
        System.out.println();
        printFields(new Person("FirstName", 2, "Kyiv"));
    }


    public static void printFields(Person person) throws IllegalAccessException, NoSuchFieldException {
        Class<? extends Person> personInfo = Person.class;
        Field fieldName = personInfo.getDeclaredField("name");
        fieldName.setAccessible(true);
        Object name = (String) fieldName.get(person);
        System.out.println("Name: " + name);

        Field fieldAge = personInfo.getDeclaredField("age");
        fieldAge.setAccessible(true);
        Object age = fieldAge.get(person);
        System.out.println("Age: " + age);

        Field fieldAddress = personInfo.getDeclaredField("address");
        fieldAddress.setAccessible(true);
        Object address = (String) fieldAddress.get(person);
        System.out.println("Address: " + address);

    }
}


