package com.practice.micro_receiver.micro_receiver.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Receiver_info")
public class Micro_Receiver {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_generator")
    @SequenceGenerator(name ="t_generator", allocationSize = 50, sequenceName = "TABLE_SEQUENCE", initialValue = 1)
    private long id;
    private String message;
    @Column(name ="receiver_date")
    private String date;

    public String getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
