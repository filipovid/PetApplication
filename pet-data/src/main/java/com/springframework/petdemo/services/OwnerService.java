package com.springframework.petdemo.services;

import com.springframework.petdemo.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
