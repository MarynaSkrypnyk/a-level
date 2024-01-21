package org.example.builder;

public class MacBuilder extends ComputerBuilder{

    @Override
    void buildProsssesor() {
        computer.setProssesor("Prossesor Mac");
    }
    @Override
    void buildRam() {
        computer.setRam(RAM.RAMONE);
    }
    @Override
    void buildPDisk() {
        computer.setDisk("Disk Mac");
    }
}
