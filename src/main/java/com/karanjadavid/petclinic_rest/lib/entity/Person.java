package com.karanjadavid.petclinic_rest.lib.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Person extends BaseJpaEntity {

    private String firstName;

    private String lastName;

}
