package com.company;

public class Main {

    public static void main(String[] args) {
	    Mobile mobile = MobileFactory.createMobile("IPhone");
	    mobile.produce();
        mobile = MobileFactory.createMobile("Samsung");
        mobile.produce();
        mobile = MobileFactory.createMobile("Nokia");
        mobile.produce();
    }
}
