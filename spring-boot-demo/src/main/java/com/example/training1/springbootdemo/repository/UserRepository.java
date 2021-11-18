package com.example.training1.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.training1.springbootdemo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    //	@Query("select * from user where id = ID and name = 'name'")
    public User findByIdAndName(Integer id, String Name);

    //	select * from user where name = ""
    public User findByName(String name);

}
