package org.example.builder;

public class Computer {
    private String prossesor;
    private RAM RAM;
    private String disk;

    public void setProssesor(String prossesor) {
        this.prossesor = prossesor;
    }
    public void setRAM(RAM RAM) {
        this.RAM = RAM;
    }
    
    public void setDisk(String disk) {
        this.disk = disk;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "prossesor='" + prossesor + '\'' +
                ", RAM='" + RAM + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
