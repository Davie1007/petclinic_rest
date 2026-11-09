package com.karanjadavid.petclinic_rest.visit.view;

import com.karanjadavid.petclinic_rest.lib.view.BaseView;
import com.karanjadavid.petclinic_rest.visit.entity.Visit;

public class VisitView extends BaseView<Visit> {
    public VisitView(Visit entity) {
        super(entity);
    }

    public String getPetEntityId(){ return entity.getPetEntityId(); }

    public String getVetEntityId(){ return entity.getVetEntityId(); }

    public String getDescription(){ return entity.getDescription(); }

}
