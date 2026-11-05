package com.karanjadavid.petclinic_rest.pet.entity;

import com.karanjadavid.petclinic_rest.lib.entity.BaseJpaEntity;
import com.karanjadavid.petclinic_rest.visit.entity.Visit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Pet extends BaseJpaEntity {

    private String name;

    private LocalDate birthDate;

    private String type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pet_id")
    @OrderBy("date ASC")
    private final Set<Visit> visits = new LinkedHashSet<>();

}
