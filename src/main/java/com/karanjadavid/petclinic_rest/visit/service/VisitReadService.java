package com.karanjadavid.petclinic_rest.visit.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoReadService;
import com.karanjadavid.petclinic_rest.visit.entity.Visit;
import com.karanjadavid.petclinic_rest.visit.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitReadService extends BaseJpaRepoReadService<Visit, VisitRepository> {
}
