package com.lseg.homework.homework9;

public class Video {
    private String title;
    private double avgRating;
    private int noOfVideos;
    private int noOfRatings;


    public Video(String title) {
        this.title = title;
        this.avgRating = 0;
        this.noOfVideos = 1;
    }

    public void checkOut() {
        if (noOfVideos > 0) {
            noOfVideos--;
        } else {
            System.out.println("Video not available!");

        }
    }

    public void returnMovie() {
        System.out.println("Video returned!");
        noOfVideos++;
    }

    public void receiveRating(int rating) {
        avgRating = (avgRating * noOfRatings + rating) / (noOfRatings + 1);
        noOfRatings++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", avgRating=" + avgRating +
                ", noOfMovies=" + noOfVideos +
                ", noOfRatings=" + noOfRatings +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public int getNoOfVideos() {
        return noOfVideos;
    }

    public void setNoOfVideos(int noOfVideos) {
        this.noOfVideos = noOfVideos;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    public void setNoOfRatings(int noOfRatings) {
        this.noOfRatings = noOfRatings;
    }
}
