package com.deneme.movie.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Role {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @ManyToOne
    private Actor actor;


    @Getter
    @Setter
    @ManyToOne
    private Movie movie;


    @Getter
    @Setter
    @Column(name = "rol_adi")
    private String roleName;
}
