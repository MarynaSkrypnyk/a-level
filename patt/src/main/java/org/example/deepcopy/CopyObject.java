package org.example.deepcopy;

public class CopyObject{
    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People("Ann", new Address("NY"));
        People copy = (People) people.clone();
        copy.getAdress().setAdress("Kyiv");

        System.out.println(copy.getAdress());
        System.out.println(people.getAdress());
    }
}