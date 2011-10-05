package com.psl.seatseller.api.internal;


import com.psl.seatseller.ticketing.Ticket;

public class TicketVO {

    private String pnr;

    private String busNumber;

    public TicketVO() {
    }

    public TicketVO(Ticket ticket) {
        this.busNumber = ticket.getNumber();
        this.pnr = ticket.getPnr();
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
}
