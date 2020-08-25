package com.deneme.movie.service.generic;

import com.deneme.movie.data.entity.Actor;
import com.deneme.movie.data.repository.ActorRepository;
import org.springframework.stereotype.Service;

@Service
public class GenericActorService extends GenericService<Actor,Long, ActorRepository> {
}
