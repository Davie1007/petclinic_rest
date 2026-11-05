package com.karanjadavid.petclinic_rest.pet.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoEditService;
import com.karanjadavid.petclinic_rest.owner.entity.Owner;
import com.karanjadavid.petclinic_rest.owner.service.OwnerReadService;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.pet.form.EditPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetsForm;
import com.karanjadavid.petclinic_rest.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetEditService extends BaseJpaRepoEditService<Pet, PetRepository> {

    private OwnerReadService ownerReadService;

    public List<Pet> registerPets(RegisterPetsForm form, String updatedByEntityId){
        List<Pet> petList = new ArrayList<>();
        for(var item : form.getRegisterPetFormNoUserList()){
            var pet = new Pet();
            pet.setName(item.getName());
            pet.setBirthDate(item.getBirthDate());
            pet.setType(item.getType());
            pet.setOwnerEntityId(item.getOwnerEntityId());
            var owner = ownerReadService.findByEntityId(item.getOwnerEntityId());
            pet.setOwner(owner);
            petList.add(pet);
        }
        petList = save(petList, updatedByEntityId);
        return petList;
    }

    public Pet editPet(String entityId, EditPetForm form){
        var pet = findByEntityId(entityId);
        var owner = ownerReadService.findByEntityId(form.getOwnerEntityId());
        mapFields(pet, form, owner);
        return pet;
    }

    public void deletePet(String entityId, String deletedBy){
        var pet = findByEntityId(entityId);
        delete(pet, deletedBy);
    }

    private void mapFields(Pet pet, EditPetForm form, Owner owner){
        pet.setName(form.getName());
        pet.setBirthDate(form.getBirthDate());
        pet.setType(form.getType());
        pet.setOwnerEntityId(form.getOwnerEntityId());
        pet.setOwner(owner);
    }

    @Autowired
    public void setOwnerReadService(OwnerReadService service){
        this.ownerReadService = service;
    }

}
