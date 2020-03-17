package com.shivam.jpapart2.TablesJoin;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("Regular")
@PrimaryKeyJoinColumn(name = "id")
public class RegularEmployee3 extends Employee5 {
    String Project;

    public String getProject() {
        return Project;
    }

    @Override
    public String toString() {
        return "RegularEmployee3{" +
                "Project='" + Project + '\'' +
                '}';
    }

    public void setProject(String project) {
        Project = project;
    }

    public RegularEmployee3(long id, int salary, String project) {
        super(id, salary);
        Project = project;
    }
    public RegularEmployee3()
    {

    }
}
