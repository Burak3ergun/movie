package com.deneme.movie.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Movie {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(name = "film_adi")
    private String name;

    @Getter
    @Setter
    @Column(name = "yil")
    private Integer year;

    @Getter
    @Setter
    @Column(name = "film_turu")
    private String type;


}
