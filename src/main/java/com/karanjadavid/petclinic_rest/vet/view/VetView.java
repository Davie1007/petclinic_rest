package com.karanjadavid.petclinic_rest.vet.view;

import com.karanjadavid.petclinic_rest.lib.view.BasePersonView;
import com.karanjadavid.petclinic_rest.vet.entity.Specialty;
import com.karanjadavid.petclinic_rest.vet.entity.Vet;

import java.util.List;

public class VetView extends BasePersonView<Vet> {
    public VetView(Vet entity) {
        super(entity);
    }

    public List<Specialty> specialties(){
        return entity.getSpecialties();
    }
}
