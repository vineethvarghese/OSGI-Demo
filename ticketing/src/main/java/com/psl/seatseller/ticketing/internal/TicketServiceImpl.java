package com.psl.seatseller.ticketing.internal;

import com.psl.seatseller.inventory.InventoryService;
import com.psl.seatseller.ticketing.Ticket;
import com.psl.seatseller.ticketing.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ticketService")
public class TicketServiceImpl implements  TicketService {

    @Autowired
    InventoryService inventoryService;

    public Ticket bookTicket() {
        return new Ticket("WE2343", inventoryService.getInventory(23l).getNumber());
    }
}
