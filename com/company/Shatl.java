package com.company;

public class Shatl implements IStart{

    @Override
    public boolean check() {
        int a = (int)(Math.random() * 10);
        if (a > 3) {
        return true;}
        else {
            return false;
        }
    }

    @Override
    public void cranking() {
        System.out.print("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.print(" Старт Шатла.");
    }
}
