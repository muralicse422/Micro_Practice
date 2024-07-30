package com.practice.one.Micro_Sender.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="sender_info")
public class Sender {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_generator")
    @SequenceGenerator(name = "t_generator", allocationSize = 50, sequenceName = "TABLE_SEQUENCE", initialValue=1)
    private long id;
    private String message;
    @Column(name ="sender_date")
    private String date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
