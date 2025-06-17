package com.design.factory;

public abstract class Computer {

    public abstract String getHdd();

    public abstract String getCpu();

    public abstract String getRam();

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public static String printConfiguration(Computer computer) {
        return ("This computer it's a " + computer.getType() + " Configuration: "
                + "HDD = " + computer.getHdd()
                + ", CPU = " + computer.getCpu()
                + ", RAM = " + computer.getRam());
    }

}
