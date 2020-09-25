package com.company;

import com.company.Mobile.Mobile;
import com.company.Sim.Sim;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory simFactory = Producer.getFactory("Sim");
        Sim sim = simFactory.getSim("BSNL");
        sim.create();

        AbstractFactory mobileFactory =Producer.getFactory("Mobile");
        Mobile mobile = mobileFactory.getMobile("Nokia");
        mobile.produce();
    }
}
