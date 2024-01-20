package com.juliomesquita.springdatagrafos.service;

import com.juliomesquita.springdatagrafos.entities.AuthorEntity;
import com.juliomesquita.springdatagrafos.repository.AuthorRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService{
    private final AuthorRepository authorRepository;

    @Override
    public List<AuthorEntity> getAll() {
        return this.authorRepository.findAll();
    }

    @Transactional
    @Override
    public AuthorEntity create(AuthorEntity author) {
        return this.authorRepository.save(author);
    }

    @Transactional
    @Override
    public AuthorEntity update(AuthorEntity author) {
        Optional<AuthorEntity> authorOpt = this.authorRepository.findById(author.getId());
        if(authorOpt.isPresent()){
            AuthorEntity authorUp =
                    AuthorEntity
                            .builder()
                            .id(author.getId())
                            .name(author.getName())
                            .books(author.getBooks())
                            .build();
            return this.authorRepository.save(authorUp);
        } else {
            return null;
        }
    }

    @Transactional
    @Override
    public void delete(AuthorEntity author) {
        this.authorRepository.delete(author);
    }
}
