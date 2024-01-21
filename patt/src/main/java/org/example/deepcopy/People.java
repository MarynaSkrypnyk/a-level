package org.example.deepcopy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.deepcopy.Address;
@NoArgsConstructor
@AllArgsConstructor
public class People implements Cloneable {
    private String name;
    private Address adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       People people = new People();
       Address address = new Address(getAdress().getAdress());
       people.setAdress(address);
       return people;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
