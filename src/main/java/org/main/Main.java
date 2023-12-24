package org.main;

public class Main {
    public static void main(String[] args) {
        Gifts<Integer> gift1 = new Gifts<>();
        gift1.setGift(5000);

        Gifts<String> gift2 = new Gifts<>();
        gift2.setGift("car");

        System.out.println(gift1.getGift());
        System.out.println(gift2.getGift());
    }
}