package me.sly.dao;

import me.sly.model.Person;

import java.util.List;

public interface PersonDao {
    void save(Person person);

    List<Person> list();
}
