package com.company.Mobile;

import com.company.AbstractFactory;
import com.company.Sim.Sim;

public class MobileFactory extends AbstractFactory {
    @Override
    protected Mobile getMobile(String type) {
        if(type.equals("IPhone")){
            return new IPhone();
        }
        if(type.equals("Samsung")){
            return new Samsung();
        }
        if(type.equals("Nokia")){
            return new Nokia();
        }
        return null;
    }

    @Override
    protected Sim getSim(String type) {
        return null;
    }
}
