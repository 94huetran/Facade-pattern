package com.codegym;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;


    public RandomListFacade(RandomNumber randomNumber, RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
        this.randomNumber = randomNumber;
    }

    public void printRandomEvenList(int min, int max) {

        int size = randomNumber.generateInteger(min, max);
        System.out.println("Random number size: "+size);
        List<Integer> listRandom = randomList.generateList(size, min, max);
        System.out.println("List random: " + listRandom);
        List<Integer> listEven = listFilter.filterOdd(listRandom);
        System.out.println("List even: " + listEven);
        listPrinter.printList(listEven);


    }
}
