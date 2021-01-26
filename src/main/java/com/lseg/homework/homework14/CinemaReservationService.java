package com.lseg.homework.homework14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CinemaReservationService {

    public static void storeSeats(Cinema cinema, int numberOfSeatsPerRow, int numberOfRows) {
        Set<Seat> seats = new HashSet<>();
        int seatCounter = 0;
        int lastRow = 'A' + (numberOfRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= numberOfSeatsPerRow; seatNumber++) {
                seats.add(new Seat((row + String.valueOf(seatNumber)), false, new BigDecimal(100)));
                seatCounter++;
            }
        }
        cinema.setSeats(seats);
    }


    public static boolean reserveSeat(Seat seatToReserve, Cinema cinema) {
        if (cinema.getSeats().contains(seatToReserve) && !seatToReserve.isReserved()) {
            cinema.getSeats().remove(seatToReserve);
            seatToReserve.setReserved(true);
            cinema.getSeats().add(seatToReserve);
            return true;
        }
        System.out.println("The seat is already reserved or the cinema doesn't have a seat with that number");
        return false;
    }


    public static boolean cancelReservation(Seat seatToReserve, Cinema cinema) {
        if (cinema.getSeats().contains(seatToReserve) && seatToReserve.isReserved()) {
            cinema.getSeats().remove(seatToReserve);
            seatToReserve.setReserved(false);
            cinema.getSeats().add(seatToReserve);
            return true;
        }
        System.out.println("The seat is not reserved or the cinema doesn't have a seat with that number");
        return false;
    }

    public static void viewReservedSeats(Cinema cinema) {
        cinema.getSeats().stream()
                .filter(Seat::isReserved)
                .forEach(System.out::println);
    }

}
