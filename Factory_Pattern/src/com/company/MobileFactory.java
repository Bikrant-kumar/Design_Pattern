package com.company;

public class MobileFactory {
    public static Mobile createMobile(String type){
        if(type.equals("IPhone")){
            return new IPhone();
        }
        if(type.equals("Samsung")){
            return new Samsung();
        }
        if(type.equals("Nokia")){
            return new Nokia();
        }
        return  null;
    }
}
