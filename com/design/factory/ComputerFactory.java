package com.design.factory;

public class ComputerFactory {

    public Computer createComputer(String Type, String Hdd, String Cpu, String Ram) {
        switch (Type) {
            case "PC": {
                return new PC(Hdd, Cpu, Ram);
            }
            case "Server": {
                return new Server(Hdd, Cpu, Ram);
            }
            default:
                throw new AssertionError();
        }
    }

}
