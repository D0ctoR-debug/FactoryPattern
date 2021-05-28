package com.company;

public class DoughnutFactory {
    public Doughnut getDoughnut(DoughnutType type) {
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY:
                toReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                toReturn = new ChocolateDoughnut();
                break;
            case ALMOND:
                toReturn = new AlmondDDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}

