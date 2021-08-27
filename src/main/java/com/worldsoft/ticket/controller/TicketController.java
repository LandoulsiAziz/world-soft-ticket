package com.worldsoft.ticket.controller;

import com.worldsoft.ticket.domain.Ticket;
import com.worldsoft.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;


    @GetMapping(value = "/ticket/{id}")
    public Ticket getTicketById(@PathVariable Long id) {

        return ticketService.getTicket(id);

    }

    @PostMapping(value = "/ticket")
    public void saveTicket(@RequestBody Ticket ticket) {
        ticketService.ajoutTicket(ticket);
    }

    @PutMapping(value = "/ticket")
    public void modifier(@RequestBody Ticket ticket) {
        ticketService.modifierTicket(ticket);
    }

    @DeleteMapping(value = "ticket")
    public void delete(@RequestBody Ticket ticket) {

        ticketService.supprimerTicket(ticket);

    }

}

