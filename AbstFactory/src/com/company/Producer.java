package com.company;

import com.company.Mobile.MobileFactory;
import com.company.Sim.SimFactory;

public class Producer {
    public static AbstractFactory getFactory(String type){
        if(type.equals("Sim")){
            return new SimFactory();
        }
        if(type.equals("Mobile")){
            return new MobileFactory();
        }
        return null;
    }
}
