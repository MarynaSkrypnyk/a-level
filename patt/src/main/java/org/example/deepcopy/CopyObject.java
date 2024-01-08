package org.example.deepcopy;

public class CopyObject{
    public static void main(String[] args) {
        People people = new People("Ann", new Address("NY"));
        People copy = clonePeople(people);
        copy.setName("Ben");

        System.out.println(people.getName());
        System.out.println(copy.getName());
        System.out.println(copy.getAdress());
    }
    public static People clonePeople(People copyPeople ){
        People copy = null;
        try {
            copy = (People) copyPeople.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return copy;
    }
}