package com.springprojects.inversioncontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class DanceFitness implements Fitness {

    // ddefault constructor




    // define a private field for the dependency


    private MoneyManagement moneyManagement;

    // create a no-argument constructor
    public DanceFitness(){

    }

    // define a constructor for dependency injection
    public DanceFitness(MoneyManagement moneyManagement) {
        this.moneyManagement = moneyManagement;
    }

    @Override
    public String teachFitnessClass() {
        return "Ben is teaching Zumba Dance";
    }

    @Override
    public String getSalary() {
        return moneyManagement.getMoney();
    }

    public void setMoneyManagement(MoneyManagement moneyManagement) {
        this.moneyManagement = moneyManagement;
    }
}
