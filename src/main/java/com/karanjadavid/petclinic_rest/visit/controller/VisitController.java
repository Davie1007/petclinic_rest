package com.karanjadavid.petclinic_rest.visit.controller;

import com.karanjadavid.petclinic_rest.visit.entity.Visit;
import com.karanjadavid.petclinic_rest.visit.form.VisitEditForm;
import com.karanjadavid.petclinic_rest.visit.form.VisitRegistrationForm;
import com.karanjadavid.petclinic_rest.visit.service.VisitEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visit")
public class VisitController {

    private VisitEditService visitEditService;

    @PostMapping("/register")
    public ResponseEntity<Visit> registerVisit(@RequestBody VisitRegistrationForm form){
        var visit = visitEditService.registerVisit(form);
        return ResponseEntity.status(HttpStatus.CREATED).body(visit);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Visit> editVisit(@PathVariable String id, @RequestBody VisitEditForm form){
        var visit = visitEditService.editVisit(id, form);
        return ResponseEntity.status(HttpStatus.OK).body(visit);
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
