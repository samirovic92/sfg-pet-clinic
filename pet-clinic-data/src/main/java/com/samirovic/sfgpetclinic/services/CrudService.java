package com.samirovic.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T pet);

    void delete(T t);

    void deleteById(ID id);

}
