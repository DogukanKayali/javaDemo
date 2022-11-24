package com.kodlamaio.springdevs.model;

import lombok.*;

import javax.persistence.*;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "language_id")
    private ProgrammingLanguage language;

}
