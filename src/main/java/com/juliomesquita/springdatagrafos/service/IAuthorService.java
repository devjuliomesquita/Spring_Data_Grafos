package com.juliomesquita.springdatagrafos.service;

import com.juliomesquita.springdatagrafos.entities.AuthorEntity;

import java.util.List;

public interface IAuthorService {
    List<AuthorEntity> getAll();
    AuthorEntity create(AuthorEntity author);
    AuthorEntity update(AuthorEntity author);
    void delete(AuthorEntity author);
}
