package com.shivam.PatientAppointment.Repositories;

import com.shivam.PatientAppointment.Entities.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepo extends CrudRepository<Appointment,Long> {
}
