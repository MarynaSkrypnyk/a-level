package org.example.builder;

public class UsualComputer extends ComputerBuilder{
    @Override
    void buildProsssesor() {
        computer.setProssesor("Prossesor Usual");
    }
    @Override
    void buildRam() {
        computer.setRam(RAM.RAMSECOND);
    }
    @Override
    void buildPDisk() {
        computer.setDisk("Disk Usual");
    }
}
