package com.karanjadavid.petclinic_rest.pet.form;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegisterPetsForm{
    private List<RegisterPetFormNoUser> registerPetFormNoUserList;
}
