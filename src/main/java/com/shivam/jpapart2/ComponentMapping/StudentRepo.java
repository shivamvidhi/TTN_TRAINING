package com.shivam.jpapart2.ComponentMapping;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Long> {
}
