package com.karanjadavid.petclinic_rest.visit.entity;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.vet.entity.Vet;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Visit extends BaseJpaEntity {

    @ManyToOne
    private Pet pet;

    private String petEntityId;

    @ManyToOne
    private Vet vet;

    private String vetEntityId;

    private String description;

}