package com.karanjadavid.petclinic_rest.owner.view;

import com.karanjadavid.petclinic_rest.lib.view.BasePersonView;
import com.karanjadavid.petclinic_rest.owner.entity.Owner;

public class OwnerView extends BasePersonView<Owner> {
    public OwnerView(Owner entity) {
        super(entity);
    }

    public String getAddress(){ return entity.getAddress(); }

    public String getCity(){ return entity.getCity(); }

    public String getTelephone(){ return entity.getTelephone(); }

}
