package com.company;

public class Main {

    public static void main(String[] args) {
        Cosmodrom cos1 = new Cosmodrom();
        Cosmodrom cos2 = new Cosmodrom();

        IStart shatl1 = new Shatl();
        IStart spaceX1 = new SpaceX();

        cos1.setIStart(shatl1);
        cos1.launch();

        System.out.println();

        cos2.setIStart(spaceX1);
        cos2.launch();

    }
}
