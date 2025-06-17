package com.design.factory;

public class TestFactoryPattern {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        Computer pc = factory.createComputer("PC", "250GB", "Intel I5", "32GB");
        Computer server = factory.createComputer("Server", "4TB", "AMD EPYC 4004", "64GB");

        System.out.println(Computer.printConfiguration(pc));
        System.out.println(Computer.printConfiguration(server));
    }
}
