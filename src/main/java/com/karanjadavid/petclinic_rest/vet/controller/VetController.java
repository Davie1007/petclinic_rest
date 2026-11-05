package com.karanjadavid.petclinic_rest.vet.controller;

import com.karanjadavid.petclinic_rest.vet.entity.Vet;
import com.karanjadavid.petclinic_rest.vet.form.EditVetForm;
import com.karanjadavid.petclinic_rest.vet.form.RegisterVetForm;
import com.karanjadavid.petclinic_rest.vet.service.VetEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vets")
public class VetController {

    private VetEditService vetEditService;

    @PostMapping("/register")
    public ResponseEntity<Vet> registerVet(@RequestBody RegisterVetForm form){
        var vet = vetEditService.registerVet(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(vet);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Vet> editVet(@PathVariable String id, @RequestBody EditVetForm form){
        var vet = vetEditService.editVet(id, form);
        return ResponseEntity.status(HttpStatus.OK).body(vet);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVet(@PathVariable String id) {
        vetEditService.deleteVet(id, "hh");
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setVetEditService(VetEditService service){
        this.vetEditService = service;
    }

}
