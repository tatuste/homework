package com.lseg.homework.homework9;

public class VideoStore {
    Video[] videos = new Video[10];

    public VideoStore(Video[] videos) {
        this.videos = videos;
    }


    public void addVideo(String videoTitle) {

        for (int i = 0; i <= videos.length - 1; i++) {
            if (videos[i] == null) {
                videos[i] = new Video(videoTitle);
                break;
            }

            for (Video tempVideo : videos) {
                if (tempVideo != null && tempVideo.getTitle().equals(videoTitle)) {
                    int temp = tempVideo.getNoOfVideos();
                    tempVideo.setNoOfVideos(temp + 1);
                }else{
                    tempVideo = new Video(videoTitle);
                }
            }


        }
    }

        public void checkOut (String videoTitle){
            for (int i = 0; i <= videos.length - 1; i++) {
                if (videos[i].getTitle().equals(videoTitle)) {
                    videos[i].checkOut();
                    break;
                }
                if (videos[i].getNoOfVideos() > 0) {
                    System.out.println("You rented video " + videos[i].getTitle());
                } else {
                    System.out.println("Video not available!");
                }

            }
        }

        public void returnVideo (String videoTitle){
            for (int i = 0; i <= videos.length - 1; i++) {
                if (videos[i].getTitle().equals(videoTitle)) {
                    videos[i].returnMovie();
                }
            }
        }

        public void receiveRating (String videoTitle,int rating){
            for (int i = 0; i <= videos.length - 1; i++) {
                if (videos[i].getTitle().equals(videoTitle)) {
                    videos[i].receiveRating(rating);
                    break;
                }
            }
        }

        public void listInventory () {
            for (int i = 0; i <= videos.length - 1; i++) {
                System.out.println(videos[i]);

            }
        }
    }