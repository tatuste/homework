package com.lseg.homework.homework14;


import java.math.BigDecimal;
import java.util.HashSet;

public class Exercise4 {
    public static void main(String[] args) {
        Cinema sun = new Cinema("sun", new HashSet<>());
        CinemaReservationService.storeSeats(sun, 10, 10);
        for(Seat seat : sun.getSeats()){
            System.out.println(seat);
        }
        System.out.println(sun.getSeats().size());



        Seat seat1 = new Seat("A4", false, new BigDecimal(100));
        Seat seat2 = new Seat("Z1", false, new BigDecimal(100));

        CinemaReservationService.reserveSeat(seat1, sun);
        System.out.println(seat1.isReserved());
        CinemaReservationService.reserveSeat(seat1, sun);

        System.out.println(CinemaReservationService.cancelReservation(seat1, sun));
        System.out.println(seat1.isReserved());

        CinemaReservationService.reserveSeat(seat1, sun);

        CinemaReservationService.viewReservedSeats(sun);
    }
}
