package com.shivam.PatientAppointment.Repositories;

import com.shivam.PatientAppointment.Entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepo extends CrudRepository<Doctor,Long> {
}
