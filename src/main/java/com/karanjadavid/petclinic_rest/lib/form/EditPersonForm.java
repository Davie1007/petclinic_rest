package com.karanjadavid.petclinic_rest.lib.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditPersonForm extends SessionUserIdForm{

    private String firstName;

    private String lastName;

}
