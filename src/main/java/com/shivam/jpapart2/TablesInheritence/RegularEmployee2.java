package com.shivam.jpapart2.TablesInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Regular")
public class RegularEmployee2 extends Employee3 {
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

    public RegularEmployee2(long id, int salary, String project) {
        super(id, salary);
        Project = project;
    }
    public RegularEmployee2()
    {

    }
}
