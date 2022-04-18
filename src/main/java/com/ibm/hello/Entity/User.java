package com.ibm.hello.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name="tb_user")
public class User implements Serializable {
    public static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName ;
    private String email;
    @Column(columnDefinition = "TIME WITHOUT TIME ZONE ")
    private Instant nascimento;

    public  User(){};

    public User(Long id, String name, String lastName, String email, Instant nascimento) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.nascimento = nascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Instant getNascimento() {
        return nascimento;
    }

    public void setNascimento(Instant nascimento) {
        this.nascimento = nascimento;
    }
}
