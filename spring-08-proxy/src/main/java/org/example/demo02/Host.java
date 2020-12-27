package org.example.demo02;


public class Host implements Renter {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
