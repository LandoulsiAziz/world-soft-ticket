package com.worldsoft.ticket.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Comment {

    @Id
    private Long id;

    private String content ;

    @CreationTimestamp
    private Timestamp creation;

    @ManyToOne
    private Ticket ticket;
}
