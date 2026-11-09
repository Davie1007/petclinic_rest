package com.karanjadavid.petclinic_rest.visit.controller;

import com.karanjadavid.petclinic_rest.lib.service.Message;
import com.karanjadavid.petclinic_rest.lib.view.EntityApiResponse;
import com.karanjadavid.petclinic_rest.visit.form.VisitEditForm;
import com.karanjadavid.petclinic_rest.visit.form.VisitRegistrationForm;
import com.karanjadavid.petclinic_rest.visit.service.VisitEditService;
import com.karanjadavid.petclinic_rest.visit.view.VisitView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/visit")
public class VisitController {

    private VisitEditService visitEditService;

    @PostMapping("/register")
    public EntityApiResponse<VisitView> registerVisit(@RequestBody VisitRegistrationForm form, Locale locale){
        var visit = visitEditService.registerVisit(form);
        return new EntityApiResponse<>(
                Message.get("pet.registration.success", locale),
                new VisitView(visit)
        );
    }

    @PutMapping("/edit/{id}")
    public EntityApiResponse<VisitView> editVisit(@PathVariable String id, @RequestBody VisitEditForm form, Locale locale){
        var visit = visitEditService.editVisit(id, form);
        return new EntityApiResponse<>(
                Message.get("pet.edit.success", locale),
                new VisitView(visit)
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteVisit(@PathVariable String id) {
        visitEditService.deleteVisit(id, "hh");
        return ResponseEntity.noContent().build();
    }

    @Autowired
    public void setVisitEditService(VisitEditService service){
        this.visitEditService = service;
    }

}
