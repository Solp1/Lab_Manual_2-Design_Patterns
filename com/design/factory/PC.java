package com.design.factory;

public class PC extends Computer {

    private final String Hdd;
    private final String Ram;
    private final String Cpu;

    public PC(String Hdd, String Cpu, String Ram) {
        this.Hdd = Hdd;
        this.Ram = Ram;
        this.Cpu = Cpu;
    }

    @Override
    public String getHdd() {
        return this.Hdd;
    }

    @Override
    public String getRam() {
        return this.Ram;
    }

    @Override
    public String getCpu() {
        return this.Cpu;
    }
}
