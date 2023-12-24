package org.main;

public class Gifts <T>{
    private T gift;

    public T getGift() {
        if (gift instanceof Integer) {
            System.out.print("Ваш подарок (₽): ");
        } else {
            System.out.print("Ваш подарок: ");
        }

        return gift;
    }

    public void setGift(T gift) {
        this.gift = gift;
    }
}
