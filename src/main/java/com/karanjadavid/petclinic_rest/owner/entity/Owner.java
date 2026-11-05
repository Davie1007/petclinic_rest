package com.karanjadavid.petclinic_rest.owner.entity;

import com.karanjadavid.petclinic_rest.lib.entity.Person;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Owner extends Person {

    private String address;

    private String city;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    @OrderBy("name")
    private List<Pet> pets = new ArrayList<>();


}
