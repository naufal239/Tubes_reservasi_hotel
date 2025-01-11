/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbs.hotel;

public class StandardReservation implements Reservasiin {
    @Override
    public String getReservationType() {
        return "Standard";
    }

    @Override
    public double calculatePrice(int duration) {
        return 120_000 * duration;
    }
}

class SuperiorReservation implements Reservasiin {
    @Override
    public String getReservationType() {
        return "Superior";
    }

    @Override
    public double calculatePrice(int duration) {
        return 350_000 * duration;
    }
}

class DeluxeReservation implements Reservasiin {
    @Override
    public String getReservationType() {
        return "Deluxe";
    }

    @Override
    public double calculatePrice(int duration) {
        return 420_000 * duration;
    }
}

class ExecutiveReservation implements Reservasiin {
    @Override
    public String getReservationType() {
        return "Executive";
    }

    @Override
    public double calculatePrice(int duration) {
        return 800_000 * duration;
    }
}