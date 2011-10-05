package com.psl.seatseller.ticketing;

public class Ticket {
    private String pnr;
    private String number;

    public Ticket(String pnr, String number) {
        this.pnr = pnr;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getPnr() {
        return pnr;
    }
}
