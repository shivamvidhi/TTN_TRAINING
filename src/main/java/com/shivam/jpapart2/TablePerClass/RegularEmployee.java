package com.shivam.jpapart2.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class RegularEmployee extends Employee4 {
    String Project;

    public String getProject() {
        return Project;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "Project='" + Project + '\'' +
                '}';
    }

    public void setProject(String project) {
        Project = project;
    }

    public RegularEmployee(long id, int salary, String project) {
        super(id, salary);
        Project = project;
    }
    public RegularEmployee()
    {

    }
}
