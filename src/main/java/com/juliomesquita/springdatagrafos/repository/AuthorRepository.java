package com.juliomesquita.springdatagrafos.repository;

import com.juliomesquita.springdatagrafos.entities.AuthorEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends Neo4jRepository<AuthorEntity, Long> {
}
