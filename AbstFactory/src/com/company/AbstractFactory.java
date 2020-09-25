package com.company;

import com.company.Mobile.Mobile;
import com.company.Sim.Sim;

public abstract class AbstractFactory {
    protected abstract Mobile getMobile (String type);
    protected  abstract Sim getSim(String  type);
}
