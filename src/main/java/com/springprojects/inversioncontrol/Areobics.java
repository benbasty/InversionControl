package com.springprojects.inversioncontrol;

public class Areobics implements Fitness {
    private MoneyManagement moneyManagement;

    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Areobics() {

    }

    public Areobics(MoneyManagement moneyManagement) {
        this.moneyManagement = moneyManagement;
    }

    public void setMoneyManagement(MoneyManagement moneyManagement) {
        this.moneyManagement = moneyManagement;
    }

    @Override
    public String teachFitnessClass() {
        return "Someone is teaching areobics";
    }

    @Override
    public String getSalary() {
        return "Someone is going to get paid";
    }
}
