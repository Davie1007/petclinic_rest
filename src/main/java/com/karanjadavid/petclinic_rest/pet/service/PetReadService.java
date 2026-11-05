package com.karanjadavid.petclinic_rest.pet.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoReadService;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetReadService extends BaseJpaRepoReadService<Pet, PetRepository> {
}
