package org.example.deepcopy;

public class Address implements Cloneable{
    private String adress;

    public Address(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return adress;
    }
}
