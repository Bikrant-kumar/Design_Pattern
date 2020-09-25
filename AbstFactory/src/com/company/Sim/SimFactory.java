package com.company.Sim;

import com.company.AbstractFactory;
import com.company.Mobile.IPhone;
import com.company.Mobile.Mobile;
import com.company.Mobile.Nokia;
import com.company.Mobile.Samsung;

public class SimFactory extends AbstractFactory {
    @Override
    protected Mobile getMobile(String type) {
        return null;
    }

    @Override
    protected Sim getSim(String type) {
        if(type.equals("BSNL")){
            return new BSNL();
        }
        if(type.equals("Airtel")){
            return new Airtel();
        }
        if(type.equals("Jio")){
            return new Jio();
        }
        return null;
    }
}
