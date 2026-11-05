package com.karanjadavid.petclinic_rest.vet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Specialty extends BaseJpaEntity {

    private String name;

    private String description;

}
