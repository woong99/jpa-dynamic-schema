package com.potatowoong.jpamultidatasource.domain.entity

import com.potatowoong.jpamultidatasource.domain.common.SCHEMA_NAME_PLACEHOLDER
import jakarta.persistence.*

@Entity
@Table(name = "multi_entity", catalog = SCHEMA_NAME_PLACEHOLDER)
class MultiEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    val name: String
)