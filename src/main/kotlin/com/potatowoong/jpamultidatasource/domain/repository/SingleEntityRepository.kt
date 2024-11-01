package com.potatowoong.jpamultidatasource.domain.repository

import com.potatowoong.jpamultidatasource.domain.entity.SingleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SingleEntityRepository : JpaRepository<SingleEntity, Int> {
}