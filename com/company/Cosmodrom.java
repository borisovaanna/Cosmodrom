package com.company;

public class Cosmodrom implements ICosmodrom{

    private IStart shatl;

    public Cosmodrom(IStart shatl) {
        this.shatl = shatl;
    }

    public Cosmodrom() {}

    public IStart getIStart() {
        return shatl;
    }

    public void setIStart(IStart shatl) {
        this.shatl = shatl;
    }

    @Override
    public void launch() {
        if(shatl.check() == false){
            System.out.print ("Предстартовая проверка провалена.");
            return;
        }
        else{
            System.out.print ("Пошёл обратный отсчёт: 10...0 ");
            shatl.cranking();
            shatl.start();
        }
    }
}
