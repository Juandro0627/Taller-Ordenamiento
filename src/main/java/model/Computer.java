package model;

public class Computer implements Comparable<Computer> {
    private String brand;
    private int ram;
    private int processors;
    private double processingSpeed;
    private char operatingSystem;

    public Computer(String brand, int ram, int processors, double processingSpeed, char operatingSystem) {
        this.brand = brand;
        this.ram = ram;
        this.processors = processors;
        this.processingSpeed = processingSpeed;
        this.operatingSystem = operatingSystem;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getProcessors() {
        return processors;
    }

    public double getProcessingSpeed() {
        return processingSpeed;
    }

    public char getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public int compareTo(Computer oc) {
        return this.brand.compareTo(oc.brand);
    }

    @Override
    public String toString(){
        return "Brand: " + brand + " | RAM: " + ram + "GB | Processors: " + processors +
                " | Speed: " + processingSpeed + " | OS: " + operatingSystem;
    }
}
