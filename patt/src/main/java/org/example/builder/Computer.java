package org.example.builder;

public class Computer {
    private String prossesor;
    private RAM ram;
    private String disk;

    public void setProssesor(String prossesor) {
        this.prossesor = prossesor;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    
    public void setDisk(String disk) {
        this.disk = disk;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "prossesor='" + prossesor + '\'' +
                ", ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
