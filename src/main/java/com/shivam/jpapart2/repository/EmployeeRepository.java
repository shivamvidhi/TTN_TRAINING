package com.shivam.jpapart2.repository;


import com.shivam.jpapart2.Entity.Employee2;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee2,Integer> {
    @Query(value = "select * from employee2",nativeQuery = true)
    List<Employee2> findAllEmployeesUsingNative();


    @Query("from Employee2")
    List<Employee2> findAllEmployees();

    @Query("Select name from Employee2")
    List<Object[]>findAllEmployeePartialData();


    @Query("Select name from Employee2 where id = :id")
    List<Object[]> findEmployeeByID(@Param("id") int id);

    @Transactional
    @Modifying
    @Query("delete from Employee2 where id =8")
    void deleteEmployeeById();

    @Query("from Employee2")
    List<Employee2> findAllEmployeesByPaging(Pageable pageable);

}
