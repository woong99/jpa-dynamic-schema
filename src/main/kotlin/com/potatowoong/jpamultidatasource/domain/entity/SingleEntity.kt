package com.potatowoong.jpamultidatasource.domain.entity

import jakarta.persistence.*

@Entity
@Table(name = "single_entity")
class SingleEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    val name: String
) 