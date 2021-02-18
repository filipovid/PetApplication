package com.springframework.petdemo.services;

import com.springframework.petdemo.model.Pet;
import com.springframework.petdemo.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
