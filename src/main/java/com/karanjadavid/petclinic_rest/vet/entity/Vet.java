package com.karanjadavid.petclinic_rest.vet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.Person;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties;

}
