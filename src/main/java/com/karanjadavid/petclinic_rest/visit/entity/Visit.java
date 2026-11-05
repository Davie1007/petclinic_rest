package com.karanjadavid.petclinic_rest.visit.entity;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Visit extends BaseJpaEntity {

    private String description;


}