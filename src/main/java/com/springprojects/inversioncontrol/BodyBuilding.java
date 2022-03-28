package com.springprojects.inversioncontrol;

public class BodyBuilding implements Fitness {

    @Override
    public String teachFitnessClass() {
        return "Roger is giving body building classes";
    }

    @Override
    public String getSalary() {
        return null;
    }
}
