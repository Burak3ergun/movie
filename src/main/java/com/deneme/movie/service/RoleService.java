package com.deneme.movie.service;

import com.deneme.movie.data.entity.Actor;
import com.deneme.movie.data.entity.Role;
import com.deneme.movie.data.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    public Role insert(String roleName, Long movieId, Long actorId){
        Role role = new Role();
        role.setRoleName(roleName);
        role.setMovie(movieService.get(movieId));
        role.setActor(actorService.get(actorId));
        return roleRepository.save(role);
    }

    public Role update(Role role){
        return roleRepository.save(role);
    }

    public void delete(Long id){
        roleRepository.deleteById(id);
    }

    public Role get(Long id){
        return roleRepository.findById(id).get();
    }

    public List<Role> getAll(){
        return roleRepository.findAll();
    }
}
