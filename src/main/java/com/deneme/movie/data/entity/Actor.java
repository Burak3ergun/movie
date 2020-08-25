package com.deneme.movie.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "aktor")
public class Actor {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(name = "isim", length = 1024)
    private String name;


    @Getter
    @Setter
    @Column(name = "yas")
    private Integer age;
}
