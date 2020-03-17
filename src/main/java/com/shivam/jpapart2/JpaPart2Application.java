package com.shivam.jpapart2;

import com.shivam.jpapart2.Assignment.Entity.Employe;
import com.shivam.jpapart2.Assignment.Repository.EmployeRepo;
import com.shivam.jpapart2.ComponentMapping.Address;
import com.shivam.jpapart2.ComponentMapping.Student;
import com.shivam.jpapart2.ComponentMapping.StudentRepo;
import com.shivam.jpapart2.Entity.Employee2;
import com.shivam.jpapart2.TablePerClass.Employee4Repo;
import com.shivam.jpapart2.TablePerClass.RegularEmployee;
import com.shivam.jpapart2.TablePerClass.Trainee;
import com.shivam.jpapart2.TablesInheritence.Employee3Repo;
import com.shivam.jpapart2.TablesInheritence.RegularEmployee2;
import com.shivam.jpapart2.TablesInheritence.Trainee2;
import com.shivam.jpapart2.TablesJoin.Employee5Repo;
import com.shivam.jpapart2.TablesJoin.RegularEmployee3;
import com.shivam.jpapart2.TablesJoin.Trainee3;
import com.shivam.jpapart2.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootApplication
public class JpaPart2Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext =SpringApplication.run(JpaPart2Application.class, args);
//		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
//		Employee2 employee = new Employee2();
//		employee.setName("A");
//
//		employeeRepository.save(employee);
//		System.out.println(employeeRepository.findAllEmployees().get(0).getId());
//
//		List<Object[]> emp = employeeRepository.findAllEmployeePartialData();
//		for(Object[] o: emp)
//		{
//			System.out.println(o[0]);
//
//		}
//
//		List<Object[]> emp2 = employeeRepository.findEmployeeByID(4);
//		for(Object[] o: emp2)
//		{
//			System.out.println(o[0]);
//
//		}
//
//		employeeRepository.deleteEmployeeById();
//
//		System.out.println(employeeRepository.findAllEmployeesByPaging(PageRequest.of(0,1, Sort.by(Sort.Order.desc("name")))));
//
//		List<Employee2> list = employeeRepository.findAllEmployeesUsingNative();
//		for(Employee2 empp : list)
//		{
//			System.out.println(empp.getName());
//			System.out.println(empp.getId());
//
//		}
//
//
//		Employee3Repo employee3Repo = applicationContext.getBean(Employee3Repo.class);
//		employee3Repo.save(new RegularEmployee2(1,2000,"Project1"));
//		employee3Repo.save(new Trainee2(2,1000,10));
//
//		System.out.println(employee3Repo.findAll());
//
//
//
//		Employee5Repo employee5Repo = applicationContext.getBean(Employee5Repo.class);
//		employee5Repo.save(new RegularEmployee3(1,2000,"Project1"));
//		employee5Repo.save(new Trainee3(2,1000,10));
//
//		System.out.println(employee5Repo.findAll());
//

//		StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
//		Student s = new Student(1,"Shivam",new Address("Meerut"));
//		studentRepo.save(s);
//		System.out.println(studentRepo.findAll());


		Employe employe1 = new Employe(1,"Shivam","Arora",1000,22);
		Employe employe2 = new Employe(2,"Shiva","Tiwari",1000,23);
		Employe employe3 = new Employe(3,"Utkarsh","Singh",2000,20);

		EmployeRepo employeRepo = applicationContext.getBean(EmployeRepo.class);
		employeRepo.save(employe1);
		employeRepo.save(employe2);
		employeRepo.save(employe3);

		List<Object[]> list = employeRepo.findAllEmployePartialData();

		for (Object[] e: list) {
			System.out.println(e[0]+"	"+e[1]);
		}



		List<Object[]> list2 = employeRepo.helpForAnswerTwo();
		for(Object[] i: list2)
		{
			System.out.println(i[0]);
			employeRepo.updateEmploye((int )25000, String.valueOf(i[0]));
		}

		System.out.println(employeRepo.findAll());


		int minsal = employeRepo.helpForAnswerThree();
		employeRepo.delete(minsal);

		employeRepo.delete(minsal);


		List<Object[]> list3 = employeRepo.getDataNative();
		for(Object[] j:list3)
		{
			System.out.println(j[0]+"	"+j[1]+"	"+j[2]);
		}


		employeRepo.deleteNative(45);

		System.out.println(employeRepo.findAll());



	}

}