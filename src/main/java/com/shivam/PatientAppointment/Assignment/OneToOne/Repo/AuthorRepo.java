package com.shivam.PatientAppointment.Assignment.OneToOne.Repo;

import com.shivam.PatientAppointment.Assignment.OneToOne.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
