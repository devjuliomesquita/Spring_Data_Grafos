package com.juliomesquita.springdatagrafos.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Node("Author")
public class AuthorEntity {
    @Id
    @GeneratedValue
    Long id;
    String name;
    @Relationship(type = "AUTHORED")
    List<BookEntity> books;
}
