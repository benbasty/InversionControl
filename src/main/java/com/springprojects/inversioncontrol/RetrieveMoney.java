package com.springprojects.inversioncontrol;

public class RetrieveMoney implements MoneyManagement {
    @Override
    public String getMoney() {
        return "Today we getting that money";
    }
}
