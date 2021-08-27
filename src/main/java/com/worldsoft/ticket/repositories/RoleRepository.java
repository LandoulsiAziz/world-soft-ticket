package com.worldsoft.ticket.repositories;


import com.worldsoft.ticket.domain.ERole;
import com.worldsoft.ticket.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
