package org.example.builder;

public abstract class ComputerBuilder{
    Computer computer;

    void createComputer(){
        computer= new Computer();
    }
    abstract void buildProsssesor();
    abstract void buildRam();
    abstract void buildPDisk();
    Computer getComputer(){
        return computer;
    }
}
