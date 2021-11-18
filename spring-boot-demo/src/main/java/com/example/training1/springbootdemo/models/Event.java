package com.example.training1.springbootdemo.models;

//@Entity
public class Event {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    Integer id;
    String name;
    String mobile;
    String city;
    String salary;

    public Event() {
    }

    public Event(String name, String mobile, String city, String salary) {
        this.name = name;
        this.mobile = mobile;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", city='" + city + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
