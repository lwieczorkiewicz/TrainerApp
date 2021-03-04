package com.example.app.users;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "trainers")
public class Trainers {

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name ="name", nullable = false)
    private String name;

    @Column(name ="last_name", nullable = false)
    private String lastName;

    @Column(name ="email", nullable = false)
    private String email;

    @Column(name ="phone_number", nullable = false)
    private int phoneNumber;

    public Trainers() {
    }

    public Trainers(String name, String lastName, String email, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phoneNumber;
    }

    public void setPhone(int phone) {
        this.phoneNumber = phone;
    }
}
