package com.karanjadavid.petclinic_rest.owner.controller;

import com.karanjadavid.petclinic_rest.lib.service.Message;
import com.karanjadavid.petclinic_rest.lib.view.EntityApiResponse;
import com.karanjadavid.petclinic_rest.owner.form.EditOwnerForm;
import com.karanjadavid.petclinic_rest.owner.form.RegisterOwnerForm;
import com.karanjadavid.petclinic_rest.owner.service.OwnerEditService;
import com.karanjadavid.petclinic_rest.owner.view.OwnerView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping( "/owners" )
class OwnerController {

    public OwnerEditService ownerEditService;

    @PostMapping("/register")
    public EntityApiResponse<OwnerView> registerOwner(@RequestBody RegisterOwnerForm form, Locale locale){
        var owner = ownerEditService.registerOwner(form);
        return new EntityApiResponse<>(
                Message.get("owner.registration.success", locale),
                new OwnerView(owner)
        );
    }

    @PutMapping("/edit/{id}")
    public EntityApiResponse<OwnerView> editOwner(@PathVariable String id, @RequestBody EditOwnerForm form, Locale locale){
        var owner = ownerEditService.editOwner(id, form);
        return new EntityApiResponse<>(
                Message.get("owner.edit.success", locale),
                new OwnerView(owner)
        );
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
