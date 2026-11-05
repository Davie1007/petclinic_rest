package com.karanjadavid.petclinic_rest.vet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.Person;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Specialty> specialties;

}
