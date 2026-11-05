package com.karanjadavid.petclinic_rest.visit.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoEditService;
import com.karanjadavid.petclinic_rest.pet.service.PetReadService;
import com.karanjadavid.petclinic_rest.vet.service.VetReadService;
import com.karanjadavid.petclinic_rest.visit.entity.Visit;
import com.karanjadavid.petclinic_rest.visit.form.VisitEditForm;
import com.karanjadavid.petclinic_rest.visit.form.VisitRegistrationForm;
import com.karanjadavid.petclinic_rest.visit.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitEditService extends BaseJpaRepoEditService<Visit, VisitRepository> {

    private PetReadService petReadService;
    private VetReadService vetReadService;

    public Visit registerVisit(VisitRegistrationForm form){
        var visit = new Visit();
        mapCommonFields(visit, form);
        return visit;
    }

    public Visit editVisit(String entityId, VisitEditForm form){
        var visit = findByEntityId(entityId);
        mapCommonFields(visit, form);
        return visit;
    }

    public void deleteVisit(String entityId, String updatedBy){
        var visit = findByEntityId(entityId);
        delete(visit, updatedBy);
    }

    private void mapCommonFields(Visit visit, VisitEditForm form){
        var pet = petReadService.findByEntityId(form.getPetEntityId());
        var vet = vetReadService.findByEntityId(form.getVetEntityId());

        visit.setPetEntityId(form.getPetEntityId());
        visit.setPet(pet);
        visit.setPetEntityId(form.getVetEntityId());
        visit.setVet(vet);
        visit.setDescription(form.getDescription());
    }

    @Autowired
    public void setPetReadService(PetReadService service){
        this.petReadService = service;
    }

    @Autowired
    public void setVetReadService(VetReadService service){
        this.vetReadService = service;
    }

}
