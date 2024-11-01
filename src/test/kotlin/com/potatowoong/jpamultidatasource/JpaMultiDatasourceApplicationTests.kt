package com.potatowoong.jpamultidatasource

import com.potatowoong.jpamultidatasource.domain.common.DBUtils
import com.potatowoong.jpamultidatasource.domain.repository.MultiEntityRepository
import com.potatowoong.jpamultidatasource.domain.repository.SingleEntityRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JpaMultiDatasourceApplicationTests {

    @Autowired
    private lateinit var multiEntityRepository: MultiEntityRepository

    @Autowired
    private lateinit var singleEntityRepository: SingleEntityRepository

    @Test
    fun contextLoads() {
    }


    @Test
    fun test() {
        // test1 스키마에 있는 데이터
        DBUtils.setSchemaName("test1")
        val test1Result = multiEntityRepository.findById(1).get()
        assert(test1Result.name == "test1 스키마")

        // test2 스키마에 있는 데이터
        DBUtils.setSchemaName("test2")
        val test2Result = multiEntityRepository.findById(1).get()
        assert(test2Result.name == "test2 스키마")

        // default 스키마에 있는 데이터
        val singleSchemaResult = singleEntityRepository.findById(1).get()
        assert(singleSchemaResult.name == "test1 스키마")
    }
}
