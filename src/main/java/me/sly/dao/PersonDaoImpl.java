package me.sly.dao;

import me.sly.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(person);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Person> list() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Person> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }
}
