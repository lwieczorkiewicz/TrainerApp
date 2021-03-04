package com.example.app.dao;

import com.example.app.users.Trainers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class TrainersDao {

    private final EntityManager entityManager;

    @Transactional
    public Trainers findById(UUID id){

        return entityManager.find(Trainers.class, id);
    }

    @Transactional
    public List<Trainers> findByName(String name) {

        return entityManager.createQuery("select t from Trainers t where t.name = :name", Trainers.class)
                .setParameter("name",name)
                .getResultList();

    }

    @Transactional
    public Trainers save(Trainers trainers) {
        entityManager.persist(trainers);
        return trainers;
    }
}
