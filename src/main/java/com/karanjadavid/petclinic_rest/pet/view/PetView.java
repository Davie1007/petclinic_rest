package com.karanjadavid.petclinic_rest.pet.view;

import com.karanjadavid.petclinic_rest.lib.view.BaseView;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;

import java.time.LocalDate;

public class PetView extends BaseView<Pet> {
    public PetView(Pet entity) {
        super(entity);
    }

    public String getName(){ return entity.getName(); }

    public LocalDate getBirthDate(){ return entity.getBirthDate(); }

    private String getType(){ return entity.getType(); }

    private String getOwnerEntityId(){ return entity.getOwnerEntityId(); }

}
