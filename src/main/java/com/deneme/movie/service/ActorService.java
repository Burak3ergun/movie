package com.deneme.movie.service;

import com.deneme.movie.data.entity.Actor;
import com.deneme.movie.data.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;


    public Actor insert(Actor actor){
        if(actor.getId() != null){
            actor.setId(null);
        }
        return actorRepository.save(actor);
    }

    public Actor update(Actor actor){
        return actorRepository.save(actor);
    }

    public void delete(Long id){
        actorRepository.deleteById(id);
    }

    public Actor get(Long id){
        return actorRepository.findById(id).get();
    }

    public List<Actor> getAll(){
        return actorRepository.findAll();
    }
}