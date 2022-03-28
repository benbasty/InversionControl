package com.springprojects.inversioncontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeadChef implements Cook  {

    @Autowired
    private ManageCooking manageCooking;

    public HeadChef() {

    }


    public HeadChef(ManageCooking manageCooking) {
        this.manageCooking = manageCooking;
    }

    @Override
    public String makeFood() {

        return "Head Chef is making food";
    }

    @Override
    public String sellFood() {

        return "Head Chef is selling food";
    }

    public String getManageCooking() {
        return manageCooking.doSomeCooking();
    }
    public void setManageCooking(ManageCooking manageCooking) {
        this.manageCooking = manageCooking;
    }
}
