package com.potatowoong.jpamultidatasource.domain.repository

import com.potatowoong.jpamultidatasource.domain.entity.MultiEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MultiEntityRepository : JpaRepository<MultiEntity, Int> {
}