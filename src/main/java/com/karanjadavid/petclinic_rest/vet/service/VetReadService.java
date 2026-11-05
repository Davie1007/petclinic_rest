package com.karanjadavid.petclinic_rest.vet.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoReadService;
import com.karanjadavid.petclinic_rest.vet.entity.Vet;
import com.karanjadavid.petclinic_rest.vet.repository.VetRepository;
import org.springframework.stereotype.Service;

@Service
public class VetReadService extends BaseJpaRepoReadService<Vet, VetRepository> {



}
