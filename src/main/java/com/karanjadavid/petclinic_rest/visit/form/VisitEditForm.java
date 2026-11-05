package com.karanjadavid.petclinic_rest.visit.form;

import com.karanjadavid.petclinic_rest.lib.form.SessionUserIdForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VisitEditForm extends SessionUserIdForm {
    private String petEntityId;

    private String vetEntityId;

    private String description;
}
