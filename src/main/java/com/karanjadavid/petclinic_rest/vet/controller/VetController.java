package com.karanjadavid.petclinic_rest.vet.controller;

import com.karanjadavid.petclinic_rest.lib.service.Message;
import com.karanjadavid.petclinic_rest.lib.view.EntityApiResponse;
import com.karanjadavid.petclinic_rest.vet.form.EditVetForm;
import com.karanjadavid.petclinic_rest.vet.form.RegisterVetForm;
import com.karanjadavid.petclinic_rest.vet.service.VetEditService;
import com.karanjadavid.petclinic_rest.vet.view.VetView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/vets")
public class VetController {

    private VetEditService vetEditService;

    @PostMapping("/register")
    public EntityApiResponse<VetView> registerVet(@RequestBody RegisterVetForm form, Locale locale){
        var vet = vetEditService.registerVet(form);
        return new EntityApiResponse<>(
                Message.get("vet.registration.success", locale),
                new VetView(vet)
        );
    }

    @PutMapping("/edit/{id}")
    public EntityApiResponse<VetView> editVet(@PathVariable String id, @RequestBody EditVetForm form, Locale locale){
        var vet = vetEditService.editVet(id, form);
        return new EntityApiResponse<>(
                Message.get("vet.edit.success", locale),
                new VetView(vet)
        );
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
