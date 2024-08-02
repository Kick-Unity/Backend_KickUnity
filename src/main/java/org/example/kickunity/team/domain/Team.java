package org.example.kickunity.team.domain;

import jakarta.persistence.*;
import org.example.kickunity.global.entity.BaseEntity;

public class Team extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private String score;

}
