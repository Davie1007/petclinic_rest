package com.karanjadavid.petclinic_rest.pet.controller;

import com.karanjadavid.petclinic_rest.pet.entity.Pet;
import com.karanjadavid.petclinic_rest.pet.form.EditPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetForm;
import com.karanjadavid.petclinic_rest.pet.form.RegisterPetsForm;
import com.karanjadavid.petclinic_rest.pet.service.PetEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Pet> editPet(@PathVariable String id, @RequestBody EditPetForm form){
        var pet = petEditService.editPet(id, form);
        return ResponseEntity.status(HttpStatus.OK).body(pet);
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
