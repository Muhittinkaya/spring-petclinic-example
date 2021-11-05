package kaya.springexample.springpetclinicexample.services;

import kaya.springexample.springpetclinicexample.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
