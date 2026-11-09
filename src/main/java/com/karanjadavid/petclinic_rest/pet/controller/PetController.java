package com.karanjadavid.petclinic_rest.pet.controller;

import com.karanjadavid.petclinic_rest.lib.service.Message;
import com.karanjadavid.petclinic_rest.lib.view.EntityApiResponse;
import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.pet.form.EditPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetsForm;
import com.karanjadavid.petclinic_rest.pet.service.PetEditService;
import com.karanjadavid.petclinic_rest.pet.view.PetView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/pets")
public class PetController {

    private PetEditService petEditService;

    @PostMapping("/register")
    public ResponseEntity<List<Pet>> registerPets(@RequestBody RegisterPetsForm form){
        var pets = petEditService.registerPets(form, "jj");
        return ResponseEntity.status(HttpStatus.CREATED).body(pets);
    }

    @PutMapping("/edit/{id}")
    public EntityApiResponse<PetView> editPet(@PathVariable String id, @RequestBody EditPetForm form, Locale locale){
        var pet = petEditService.editPet(id, form);
        return new EntityApiResponse<>(
                Message.get("pet.edit.success", locale),
                new PetView(pet)
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePet(@PathVariable String id) {
        petEditService.deletePet(id, "hh");
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setPetEditService(PetEditService service){
        this.petEditService = service;
    }

}
