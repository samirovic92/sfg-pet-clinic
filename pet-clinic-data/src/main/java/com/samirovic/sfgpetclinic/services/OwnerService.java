package com.samirovic.sfgpetclinic.services;

import com.samirovic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
