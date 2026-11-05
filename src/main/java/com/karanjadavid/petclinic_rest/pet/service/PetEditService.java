package com.karanjadavid.petclinic_rest.pet.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoEditService;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.pet.form.EditPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetFormNoUser;
import com.karanjadavid.petclinic_rest.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetEditService extends BaseJpaRepoEditService<Pet, PetRepository> {

    public Pet registerPet(RegisterPetForm form){
        var pet = new Pet();
        return pet;
    }

    public List<Pet> registerPets(RegisterPetFormNoUser form, String updatedByEntityId){
        List<Pet> petList = new ArrayList<>();
        petList = save(petList, updatedByEntityId);
        return petList;
    }

    public Pet editPet(String entityId, EditPetForm form){
        var pet = findByEntityId(entityId);
        return pet;
    }

    public void deletePet(String entityId, String deletedBy){
        var pet = findByEntityId(entityId);
        delete(pet, deletedBy);
    }

}
