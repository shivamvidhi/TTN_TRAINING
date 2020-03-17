package com.shivam.jpapart2.TablesInheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Trainee")
public class Trainee2 extends Employee3{
    int score;

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "score=" + score +
                '}';
    }

    public Trainee2(long id, int salary, int score) {
        super(id, salary);
        this.score = score;
    }
    public Trainee2()
    {

    }

    public void setScore(int score) {
        this.score = score;
    }


}
