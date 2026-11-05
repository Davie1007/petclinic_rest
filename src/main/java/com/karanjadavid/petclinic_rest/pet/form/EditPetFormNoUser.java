package com.karanjadavid.petclinic_rest.pet.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EditPetFormNoUser {

    private String name;

    private LocalDate birthDate;

    private String type;

    private String ownerEntityId;

}
