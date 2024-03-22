package com.example.eserciziohibernate.entities;

import jakarta.persistence.*;

import java.util.List;

//con lombok @Data e @NoArgsConstructor e @AllArgConstructor
@Entity
@Table
public class User extends BaseEntityData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true, name = "userEmail", length = 100)
    private String email;
    private Integer age;
    private String city;
    private String placeOfBirth;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user") //lazy perché ogni volta che prendo un utente non voglio tutti i suoi ordini
    private List<Order> orderList;

    public User(long id, String firstName, String lastName, String email, Integer age, String city, String placeOfBirth, List<Order> orderList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.city = city;
        this.placeOfBirth = placeOfBirth;
        this.orderList = orderList;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
