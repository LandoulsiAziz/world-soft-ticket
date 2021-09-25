package com.worldsoft.ticket.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String object;

    private Priority priority;

    private String label;

    @CreationTimestamp
    private Timestamp creation;

    private String content;

    @OneToMany(mappedBy = "ticket")
    private Set<Comment> comments = new HashSet<>();

    private Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
