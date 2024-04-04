package com.example.leaderboard.models;


import jakarta.persistence.*;

@Table(name = "users")
@Entity
public class User {
    @Id
    @Column
    private String name;
    @Column
    private Long points;

    @Override
    public String toString(){
        return name;
    }

    public User(){}
    public User(String name, Long points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
