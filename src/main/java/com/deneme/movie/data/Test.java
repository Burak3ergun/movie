package com.deneme.movie.data;

import com.deneme.movie.data.entity.Actor;
import com.deneme.movie.data.repository.ActorRepository;
import com.deneme.movie.service.ActorService;
import com.deneme.movie.service.generic.GenericActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test {

    @Autowired
    private ActorService actorService;

//    @Autowired
//    private GenericActorService genericActorService;

//    @Autowired
//    private ActorRepository actorRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void updateFirstActor(){
        Actor actorToBeUpdated = actorService.get(1L);

        actorToBeUpdated.setAge(80);
        actorService.update(actorToBeUpdated);

        List<Actor> allActors = actorService.getAll();
        System.out.println(allActors);

    }
}
