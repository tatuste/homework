package com.lseg.homework.homework14;

import java.util.Set;

public class Cinema {
    String name;
    Set<Seat> seats;

    public Cinema(String name, Set<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }
}
