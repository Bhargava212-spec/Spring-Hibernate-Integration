package com.pack.model;

 

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

 

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

 

 
@Entity
@Table(name="emp3000")
public class Employee {
	@Id
    private Integer employeeid;
    @NotEmpty
    @Size(min=6,max=25)
    private String name;
    @NotNull
    @Min(value=20)
    @Max(value=50)
    private Integer age;
    @NotEmpty
    private String address;
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date doj;
    @NotEmpty
    private String gender;
    @NotEmpty
    @Email
    private String email;

 

    public Integer getEmployeeid() {
        return employeeid;
    }

 

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public Integer getAge() {
        return age;
    }

 

    public void setAge(Integer age) {
        this.age = age;
    }

 

    public String getAddress() {
        return address;
    }

 

    public void setAddress(String address) {
        this.address = address;
    }

 

    public Date getDoj() {
        return doj;
    }

 

    public void setDoj(Date doj) {
        this.doj = doj;
    }

 

    public String getGender() {
        return gender;
    }

 

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

    public Employee(Integer employeeid, String name, Integer age, String address, Date doj, String gender,
            String email) {
        super();
        this.employeeid = employeeid;
        this.name = name;
        this.age = age;
        this.address = address;
        this.doj = doj;
        this.gender = gender;
        this.email = email;
    }

 

    public Employee() {
        super();
    }
}