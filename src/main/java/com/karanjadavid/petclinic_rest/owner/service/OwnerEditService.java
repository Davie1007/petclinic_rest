package com.karanjadavid.petclinic_rest.owner.service;

import com.karanjadavid.petclinic_rest.lib.service.BaseJpaRepoEditService;
import com.karanjadavid.petclinic_rest.owner.entity.Owner;
import com.karanjadavid.petclinic_rest.owner.form.EditOwnerForm;
import com.karanjadavid.petclinic_rest.owner.form.RegisterOwnerForm;
import com.karanjadavid.petclinic_rest.owner.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerEditService extends BaseJpaRepoEditService<Owner, OwnerRepository> {

    public Owner registerOwner(RegisterOwnerForm form){
        var owner = new Owner();
        mapFields(owner, form);
        return owner;
    }

    public Owner editOwner(String entityId, EditOwnerForm form){
        var owner = findByEntityId(entityId);
        mapFields(owner, form);
        return owner;
    }

    public void deleteOwner(String entityId, String deletedByEntityId){
        var owner = findByEntityId(entityId);
        delete(owner, deletedByEntityId);
    }

    private void mapFields(Owner owner, EditOwnerForm form){
        owner.setFirstName(form.getFirstName());
        owner.setLastName(form.getLastName());
        owner.setAddress(form.getAddress());
        owner.setCity(form.getCity());
        owner.setTelephone(form.getTelephone());
    }

}
