package com.lseg.homework.homework9;


public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore(new Video[10]);

        videoStore.addVideo("The Matrix");
        videoStore.addVideo("The Matrix");
        videoStore.addVideo("The Matrix");
        videoStore.addVideo("Godfather II");
        videoStore.addVideo("Star Wars Episode IV: A New Hope");


        videoStore.receiveRating("The Matrix",8);
        videoStore.receiveRating("Godfather II",7);
        videoStore.receiveRating("The Matrix",3);
        videoStore.receiveRating("The Matrix",4);



        videoStore.listInventory();



    }
}
