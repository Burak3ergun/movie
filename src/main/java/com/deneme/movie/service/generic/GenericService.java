package com.deneme.movie.service.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericService<T, ID, R extends JpaRepository<T,ID>> {

    @Autowired
    R repository;

    public T insert(T entity){
        return repository.save(entity);
    }

    public T update(T entity){
        return repository.save(entity);
    }

    public void delete(ID id){
        repository.deleteById(id);
    }

    public T get(ID id){
        return repository.findById(id).get();
    }

    public List<T> getAll(){
        return repository.findAll();
    }
}
