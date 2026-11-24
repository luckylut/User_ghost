package com.dt2.ghost.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @Email
    private String email;
    @Size(min =6, max=20, message = "O tamanho deve ser entre 6 e 20")
    private String passord;
    @CPF
    private String cpf;
    @NotNull
    private int age;

    public User(int id, String name, String email, String passord, String cpf, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passord = passord;
        this.cpf = cpf;
        this.age = age;

    }

    public User(String name, String email, String password, String cpf, int age) {
        this.name = name;
        this.email = email;
        this.passord = passord;
        this.cpf = cpf;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


