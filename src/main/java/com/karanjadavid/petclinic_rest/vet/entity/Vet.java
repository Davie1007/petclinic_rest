package com.karanjadavid.petclinic_rest.vet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Specialty> specialties;

}
