package kaya.springexample.springpetclinicexample.services;

import kaya.springexample.springpetclinicexample.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();
}
