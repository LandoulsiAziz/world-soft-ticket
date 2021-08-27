package com.worldsoft.ticket;


import com.worldsoft.ticket.domain.Ticket;
import com.worldsoft.ticket.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public void run(String... args) throws Exception {

        Ticket ticket = Ticket.builder().content("ticket").label("world soft").date(new Date()).build();

        ticketRepository.save(ticket);
    }
}
