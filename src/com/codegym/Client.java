package com.codegym;

public class Client {
    public void display(int min, int max) {
        RandomListFacade randomListFacade = new RandomListFacade(new RandomNumber(),new RandomList(), new ListFilter(), new ListPrinter());
        randomListFacade.printRandomEvenList(min,max);
    }
}
