package com.lseg.homework.homework8.mandatory;

public class Homework8 {

    public static void main(String[] args) {
        Wall wall1 = new Wall(4, 2, "white");
        Wall wall2 = new Wall(5, 2, "white");
        Wall wall3 = new Wall(4, 2, "white");
        Wall wall4 = new Wall(5, 2, "white");
        Floor floor = new Floor(5, 4, "black", "granit");
        Dimension dimensionCouch = new Dimension(2, 1, 0.5);
        Couch couch = new Couch(dimensionCouch, "green", "leather", 3);
        Dimension dimensionTable = new Dimension(2, 1, 0.4);
        CoffeeTable coffeeTable = new CoffeeTable(dimensionTable, "white", "wood", 3);
        Dimension dimensionUnit = new Dimension(2, 1, 0.7);
        TvUnit tvUnit = new TvUnit(dimensionUnit, "white", "wood");
        Dimension dimensionTv = new Dimension(1, 0.2, 0.5);
        TV tv = new TV("Samsung", dimensionTv);
        Dimension dimensionRemote = new Dimension(0.1, 0.05, 0.05);
        RemoteController remoteController = new RemoteController(dimensionRemote, "black");
        Dimension dimensionCase = new Dimension(1, 1, 1);
        BookCase bookCase = new BookCase(dimensionCase, "white", "wood", 3);

        LivingRoom living = new LivingRoom(wall1, wall2, wall3, wall4, floor, couch, coffeeTable, tvUnit, tv, remoteController, bookCase);

        living.watchTV("Start");
    }
}

