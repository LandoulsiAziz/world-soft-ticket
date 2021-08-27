package com.worldsoft.ticket.service;

import com.worldsoft.ticket.domain.Ticket;
import com.worldsoft.ticket.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;



    @Override
    @Transactional
    public void ajoutTicket(Ticket ticket) {

        ticket.setId(null);
        ticketRepository.save(ticket);

    }

    @Override
    public void supprimerTicket(Ticket ticket) {
        ticketRepository.delete(ticket);
    }

    @Override
    @Transactional
    public void modifierTicket(Ticket ticket) {

        Optional<Ticket> optionalTicket = ticketRepository.findById(ticket.getId());
        Ticket savedTicket = optionalTicket.get();
        savedTicket.setContent(ticket.getContent());
        savedTicket.setLabel(ticket.getLabel());
        savedTicket.setDate(ticket.getDate());

        ticketRepository.save(savedTicket);

    }

    @Override
    public Ticket getTicket(Long id) {
        return ticketRepository.findById(id).get();
    }

}
