package com.shivam.jpapart2.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Trainee extends Employee4 {
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

    public Trainee(long id, int salary, int score) {
        super(id, salary);
        this.score = score;
    }
    public Trainee()
    {

    }

    public void setScore(int score) {
        this.score = score;
    }


}
