package com.karanjadavid.petclinic_rest.lib.view;

import com.karanjadavid.petclinic_rest.lib.entity.Person;

public abstract class BasePersonView<T extends Person> extends BaseView<T>{
    public BasePersonView(T entity) {
        super(entity);
    }

    public String getFirstName(){ return entity.getFirstName(); }

    public String getLastName(){ return entity.getLastName(); }
}
