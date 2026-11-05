package com.karanjadavid.petclinic_rest.owner.repository;

import com.karanjadavid.petclinic_rest.lib.repository.BaseJpaRepository;
import com.karanjadavid.petclinic_rest.owner.entity.Owner;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends BaseJpaRepository<Owner> {

}
