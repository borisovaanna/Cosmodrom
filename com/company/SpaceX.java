package com.company;

public class SpaceX implements IStart{
    @Override
    public boolean check() {
        int b = (int)(Math.random() * 100);
        if (b <= 15) {
            return true;}
        else {
            return false;
        }
    }

    @Override
    public void cranking() {
        System.out.print("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.print(" Старт SpaceX.");
    }
}
