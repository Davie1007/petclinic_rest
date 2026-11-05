package com.karanjadavid.petclinic_rest.lib.service;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.petclinic_rest.lib.repository.BaseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseJpaRepoReadService<T extends BaseJpaEntity, R extends BaseJpaRepository<T>> {

    protected R repository;

    public T findByEntityId(String entityId){
        var modelOptional = repository.findByEntityId(entityId);
        return modelOptional.orElse(null);
    }

    @Autowired
    public void setRepository(R repository){
        this.repository = repository;
    }

}
