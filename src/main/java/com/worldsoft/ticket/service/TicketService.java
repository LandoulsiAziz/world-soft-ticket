package com.worldsoft.ticket.service;

import com.worldsoft.ticket.domain.Ticket;

public interface TicketService {

    void ajoutTicket(Ticket ticket);

    void supprimerTicket(Ticket ticket);

    void modifierTicket(Ticket ticket);

    Ticket getTicket(Long id);

}