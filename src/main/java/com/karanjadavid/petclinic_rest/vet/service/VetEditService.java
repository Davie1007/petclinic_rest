package com.karanjadavid.petclinic_rest.vet.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoEditService;
import com.karanjadavid.petclinic_rest.vet.entity.Vet;
import com.karanjadavid.petclinic_rest.vet.form.EditVetForm;
import com.karanjadavid.petclinic_rest.vet.form.RegisterVetForm;
import com.karanjadavid.petclinic_rest.vet.repository.VetRepository;
import org.springframework.stereotype.Service;

@Service
public class VetEditService extends BaseJpaRepoEditService<Vet, VetRepository> {

    public Vet registerVet(RegisterVetForm form){
        var vet = new Vet();
        mapCommonFields(vet, form);
        return vet;
    }

    public Vet editVet(String entityId, EditVetForm form){
        var vet = findByEntityId(entityId);
        mapCommonFields(vet, form);
        return vet;
    }

    public void deleteVet(String entityId, String deletedBy){
        var vet = findByEntityId(entityId);
        delete(vet, deletedBy);
    }

    private void mapCommonFields(Vet vet, EditVetForm form){
        vet.setFirstName(form.getFirstName());
        vet.setLastName(form.getLastName());
        vet.setSpecialties(form.getSpecialties());
    }

}
