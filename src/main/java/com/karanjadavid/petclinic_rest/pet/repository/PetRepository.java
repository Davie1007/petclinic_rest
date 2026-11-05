package com.karanjadavid.petclinic_rest.pet.repository;

import com.karanjadavid.petclinic_rest.lib.repository.BaseJpaRepository;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends BaseJpaRepository<Pet> {
}
