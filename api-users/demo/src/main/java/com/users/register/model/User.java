package com.users.register.model;

public class User {
    
    private Integer id;
    private String name;
    private String email;
    private Integer phone;

    public User(){
        super();
    } 

    public User(Integer id, String name, String email, Integer phone){
        super();

        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Integer getPhone(){
        return phone;
    }

    public void setPhone(Integer phone){
        this.phone = phone;
    }
}