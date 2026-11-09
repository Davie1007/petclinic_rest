package com.karanjadavid.petclinic_rest.vet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Specialty> specialties;

}
