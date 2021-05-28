package com.company;

public class Main {

    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();

        Doughnut cherry = factory.getDoughnut(DoughnutType.CHERRY);
        Doughnut chocolate = factory.getDoughnut(DoughnutType.CHOCOLATE);
        Doughnut almond = factory.getDoughnut(DoughnutType.ALMOND);

        cherry.eat();
        chocolate.eat();
        almond.eat();
    }
}
