package com.company;

public class Main {

    public static void main(String[] args) {
	    User user = new AccountBuilder().setName("Bikrant Kumar").setEmail("bikrantkmr6@gmail.com").getUser();
	    System.out.println(user);
    }
}
