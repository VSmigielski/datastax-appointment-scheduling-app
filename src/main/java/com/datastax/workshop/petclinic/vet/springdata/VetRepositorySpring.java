package com.datastax.workshop.petclinic.vet.springdata;

import java.util.UUID;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepositorySpring extends ReactiveCassandraRepository<VetEntitySpring, UUID> {
    
}
