package com.shivam.PatientAppointment.Repositories;

import com.shivam.PatientAppointment.Entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepo extends CrudRepository<Patient,Long> {
}
