package com.karanjadavid.petclinic_rest.pet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.petclinic_rest.owner.entity.Owner;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Pet extends BaseJpaEntity {

    private String name;

    private LocalDate birthDate;

    private String type;

    @OneToOne
    private Owner owner;

    private String ownerEntityId;

}
