package com.shivam.jpapart2.TablesJoin;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("Trainee")
@PrimaryKeyJoinColumn(name = "id")
public class Trainee3 extends Employee5 {
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

    public Trainee3(long id, int salary, int score) {
        super(id, salary);
        this.score = score;
    }
    public Trainee3()
    {

    }

    public void setScore(int score) {
        this.score = score;
    }


}
