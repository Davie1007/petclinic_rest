package com.karanjadavid.petclinic_rest.owner.form;

import com.karanjadavid.petclinic_rest.lib.form.EditPersonForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditOwnerForm extends EditPersonForm {

    private String address;

    private String city;

    private String telephone;

}
