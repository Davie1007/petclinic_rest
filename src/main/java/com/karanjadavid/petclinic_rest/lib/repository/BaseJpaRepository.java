package com.karanjadavid.petclinic_rest.lib.repository;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseJpaRepository<T extends BaseJpaEntity> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

    Optional<T> findByEntityId(String entityId);

}
