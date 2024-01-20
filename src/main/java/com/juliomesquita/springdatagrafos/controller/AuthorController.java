package com.juliomesquita.springdatagrafos.controller;

import com.juliomesquita.springdatagrafos.service.IAuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/author")
@RequiredArgsConstructor
public class AuthorController {

    private final IAuthorService service;
}
