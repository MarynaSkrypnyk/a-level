package org.example.builder;

public class Director {
    ComputerBuilder builder;
    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }
    Computer buildComputer(){
        builder.createComputer();
        builder.buildProsssesor();
        builder.buildRAM();
        builder.buildPDisk();
        Computer computer = builder.getComputer();
        return computer;
    }
}
