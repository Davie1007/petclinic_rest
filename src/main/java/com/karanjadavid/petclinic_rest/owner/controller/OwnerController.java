package com.karanjadavid.petclinic_rest.owner.controller;

import com.karanjadavid.petclinic_rest.owner.entity.Owner;
import com.karanjadavid.petclinic_rest.owner.form.EditOwnerForm;
import com.karanjadavid.petclinic_rest.owner.form.RegisterOwnerForm;
import com.karanjadavid.petclinic_rest.owner.service.OwnerEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/owners" )
class OwnerController {

    public OwnerEditService ownerEditService;

    @PostMapping("/register")
    public ResponseEntity<Owner> registerOwner(@RequestBody RegisterOwnerForm form){
        var owner = ownerEditService.registerOwner(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(owner);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Owner> editOwner(@PathVariable String id, @RequestBody EditOwnerForm form){
        var owner = ownerEditService.editOwner(id, form);
        return ResponseEntity.status(HttpStatus.OK).body(owner);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOwner(@PathVariable String id) {
        ownerEditService.deleteOwner(id, "hh");
        return ResponseEntity.noContent().build();
    }


    @Autowired
    public void setOwnerEditService(OwnerEditService service){
        this.ownerEditService = service;
    }

}
