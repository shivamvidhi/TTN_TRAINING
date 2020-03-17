package com.shivam.PatientAppointment;

import com.shivam.PatientAppointment.Assignment.ManyToMany.Entity.Address_3;
import com.shivam.PatientAppointment.Assignment.ManyToMany.Entity.Author_3;
import com.shivam.PatientAppointment.Assignment.ManyToMany.Entity.Book_3;
import com.shivam.PatientAppointment.Assignment.ManyToMany.Repo.AuthorRepo3;
import com.shivam.PatientAppointment.Assignment.OneToMany.Entity.Address_2;
import com.shivam.PatientAppointment.Assignment.OneToMany.Entity.Author_2;
import com.shivam.PatientAppointment.Assignment.OneToMany.Entity.Book_2;
import com.shivam.PatientAppointment.Assignment.OneToOne.Entity.Address;
import com.shivam.PatientAppointment.Assignment.OneToOne.Entity.Author;
import com.shivam.PatientAppointment.Assignment.OneToOne.Entity.Book;
import com.shivam.PatientAppointment.Assignment.OneToOne.Entity.Subject;
import com.shivam.PatientAppointment.Assignment.OneToOne.Repo.AuthorRepo;
import com.shivam.PatientAppointment.Assignment.OneToMany.Repo.Author_2Repo;
import com.shivam.PatientAppointment.Entities.Appointment;
import com.shivam.PatientAppointment.Entities.Doctor;
import com.shivam.PatientAppointment.Entities.Insurance;
import com.shivam.PatientAppointment.Entities.Patient;
import com.shivam.PatientAppointment.Repositories.AppointmentRepo;
import com.shivam.PatientAppointment.Repositories.DoctorRepo;
import com.shivam.PatientAppointment.Repositories.PatientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class PatientAppointmentApplicationTests {

	@Autowired
	DoctorRepo doctorRepo;

	@Autowired
	PatientRepo patientRepo;

	@Autowired
	AppointmentRepo appointmentRepo;

	@Autowired
	AuthorRepo authorRepo;

	@Autowired
	Author_2Repo author_2Repo;

	@Autowired
	AuthorRepo3 authorRepo3;

	@Test
	void contextLoads() {
	}


	@Test
	public void createDoctor()
	{
		Doctor doctor = new Doctor();
		 doctor.setFirstName("Dr. First");
		 doctor.setLastName("Sharma");
		 doctor.setSpeciality("All");
		 doctorRepo.save(doctor);
	}


	@Test
	public void createPatient()
	{
		Patient patient = new Patient();
		patient.setFirstName("Shivam");
		patient.setLastName("Arora");
		patient.setPhone("8077742157");

		Insurance insurance = new Insurance();
		insurance.setProviderName("Blue cross Blue Shield");
		insurance.setCopay(20d);
		patient.setInsurance(insurance);

		Optional<Doctor> doctor = doctorRepo.findById(1L);
		List<Doctor> list = Arrays.asList(doctor.get());
		patient.setDoctors(list);

		patientRepo.save(patient);
	}

	@Test
	public void createAppointment()
	{
		Appointment appointment = new Appointment();
		appointment.setReason("i am having fever");

		Timestamp timestamp = new Timestamp(new Date().getTime());
		appointment.setAppointmentTime(timestamp);

		appointment.setStarted(true);
		appointment.setPatient(patientRepo.findById(1L).get());
		appointment.setDoctor(doctorRepo.findById(1L).get());
		appointmentRepo.save(appointment);
	}

	@Test
	public void createAuthor()
	{
		Author author = new Author();
		author.setName("shivam");

		Address address = new Address();
		address.setLocation("a");
		address.setState("B");
		address.setStreet("C");

		author.setAddress(address);

		Subject subject1 = new Subject();
		subject1.setName("one");


		Subject subject2 = new Subject();
		subject2.setName("two");


		Subject subject3 = new Subject();
		subject3.setName("Three");

		List<Subject> subjects = Arrays.asList(subject1,subject2,subject3);

		author.setSubjectList(subjects);

		Book book = new Book();
		book.setName("Book_2");

		author.setBook(book);
		authorRepo.save(author);
	}

	@Test
	public void createAuthor_2()
	{
		Author_2 author = new Author_2();
		author.setName("shivam");

		Address_2 address = new Address_2();
		address.setLocation("a");
		address.setState("B");
		address.setStreet("C");

		author.setAddress2(address);


		Book_2 book = new Book_2();
		book.setName("Book");
		book.setAuthor(author);
		List Book = Arrays.asList(book);
		author.setBook2(Book);
		author_2Repo.save(author);
	}

	@Test
	public void createAuthor_3()
	{
		Author_3 author = new Author_3();
		author.setName("shivam");

		Address_3 address = new Address_3();
		address.setLocation("a");
		address.setState("B");
		address.setStreet("C");

		author.setAddress2(address);


		Book_3 book = new Book_3();
		book.setName("Book");
		book.setAuthor(Arrays.asList(author));
		List Book = Arrays.asList(book);
		author.setBook2(Book);
		authorRepo3.save(author);
	}

}
