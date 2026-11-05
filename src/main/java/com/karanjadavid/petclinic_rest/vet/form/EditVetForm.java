package com.karanjadavid.petclinic_rest.vet.form;

import com.karanjadavid.petclinic_rest.lib.form.EditPersonForm;
import com.karanjadavid.petclinic_rest.vet.entity.Specialty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EditVetForm extends EditPersonForm {
    private List<Specialty> specialties;
}
