package com.lseg.homework.homework8;

public class LivingRoom {
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Floor floor;
    private Couch couch;
    private CoffeeTable coffeeTable;
    private TvUnit tvUnit;
    private TV tv;
    private RemoteController remoteController;
    private BookCase bookCase;

    public LivingRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Floor floor, Couch couch, CoffeeTable coffeeTable, TvUnit tvUnit, TV tv, RemoteController remoteController, BookCase bookCase) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.floor = floor;
        this.couch = couch;
        this.coffeeTable = coffeeTable;
        this.tvUnit = tvUnit;
        this.tv = tv;
        this.remoteController = remoteController;
        this.bookCase = bookCase;
    }
    public void watchTV(String command){
        remoteController.pressButton(command);
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Floor getFloor() {
        return floor;
    }

    public Couch getCouch() {
        return couch;
    }

    public CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

    public TvUnit getTvUnit() {
        return tvUnit;
    }

    public TV getTv() {
        return tv;
    }

    public RemoteController getRemoteController() {
        return remoteController;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setCouch(Couch couch) {
        this.couch = couch;
    }

    public void setCoffeeTable(CoffeeTable coffeeTable) {
        this.coffeeTable = coffeeTable;
    }

    public void setTvUnit(TvUnit tvUnit) {
        this.tvUnit = tvUnit;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void setRemoteController(RemoteController remoteController) {
        this.remoteController = remoteController;
    }

    public BookCase getBookCase() {
        return bookCase;
    }

    public void setBookCase(BookCase bookCase) {
        this.bookCase = bookCase;
    }
}

