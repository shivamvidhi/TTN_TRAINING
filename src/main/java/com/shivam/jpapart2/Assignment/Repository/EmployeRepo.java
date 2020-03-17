package com.shivam.jpapart2.Assignment.Repository;

import com.shivam.jpapart2.Assignment.Entity.Employe;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeRepo extends CrudRepository<Employe,Long> {

    @Query("select fname,lname from Employe as emp where salary > (select avg(salary) from Employe ORDER BY age ASC, salary DESC)")
    public List<Object[]> findAllEmployePartialData();

    @Query("select fname from Employe where salary<(select avg(salary) from Employe )")
    List<Object[]> helpForAnswerTwo();


    @Transactional
    @Modifying
    @Query("update Employe emp set emp.salary=:sal where emp.fname=:name")
    public void updateEmploye(@Param("sal")int sal, @Param("name") String name);


    @Query("select min(salary) from Employe")
    int helpForAnswerThree();

    @Transactional
    @Modifying
    @Query("delete from Employe where salary=:minSal")
    void delete(@Param("minSal") int minSal);


    @Query(value = "select id,fname,age from employe where lname like '%Singh'",nativeQuery = true)
    List<Object[]> getDataNative();

    @Transactional
    @Modifying
    @Query(value = "delete from employe where age>:age",nativeQuery = true)
    void deleteNative(@Param("age") int age);

}
