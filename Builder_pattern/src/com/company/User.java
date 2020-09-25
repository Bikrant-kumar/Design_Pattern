package com.company;

public class User {
    private String Name;
    private String Email;
    private int Age;
    private Long Mob_no;

    public User(String name, String email, int age, Long mob_no) {
        Name = name;
        Email = email;
        Age = age;
        Mob_no = mob_no;
    }
    @Override
    public String toString(){
        return "user[Name = "+Name+" Email = "+Email+" Age = "+Age+" Mob_no = "+Mob_no+"]";
    }
}
