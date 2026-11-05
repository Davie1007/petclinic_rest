package com.karanjadavid.petclinic_rest.lib.service;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.petclinic_rest.lib.repository.BaseJpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public class BaseJpaRepoEditService<T extends BaseJpaEntity, R extends BaseJpaRepository<T>> extends BaseJpaRepoReadService<T, R> {

    public T save(T model, String updatedByEntityId){
        model.setCreatedAt(LocalDateTime.now());
        model.setCreatedBy(updatedByEntityId);
        model.setUpdatedAt(LocalDateTime.now());
        model.setUpdatedBy(updatedByEntityId);
        return repository.save(model);
    }

    public List<T> save(List<T> models, String updatedByEntityId){
        for(var model : models){
            model.setCreatedAt(LocalDateTime.now());
            model.setCreatedBy(updatedByEntityId);
            model.setUpdatedAt(LocalDateTime.now());
            model.setUpdatedBy(updatedByEntityId);
        }
        return repository.saveAll(models);
    }

    public void delete(T model, String deletedByEntityId){
        model.setDeletedAt(LocalDateTime.now());
        model.setUpdatedBy(deletedByEntityId);
        repository.save(model);
    }

}
