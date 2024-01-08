package org.example.builder;

public class UsualComputer extends ComputerBuilder{
    @Override
    void buildProsssesor() {
        computer.setProssesor("Prossesor Usual");
    }
    @Override
    void buildRAM() {
        computer.setRAM(RAM.RAMSECOND);
    }
    @Override
    void buildPDisk() {
        computer.setDisk("Disk Usual");
    }
}
