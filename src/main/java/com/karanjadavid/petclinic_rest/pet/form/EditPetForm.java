package com.karanjadavid.petclinic_rest.pet.form;

import com.karanjadavid.petclinic_rest.lib.form.SessionUserIdForm;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EditPetForm extends SessionUserIdForm {

    private String name;

    private LocalDate birthDate;

    private String type;

    private String ownerEntityId;

}
