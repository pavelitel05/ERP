package com.example.nerzon.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class Task {
    private long userId;

    private long id;

    private String task;

    private Date date;

    private boolean isComplete;

}
