package com.potatowoong.jpamultidatasource

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaMultiDatasourceApplication

fun main(args: Array<String>) {
    runApplication<JpaMultiDatasourceApplication>(*args)
}
