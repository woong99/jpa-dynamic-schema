package com.potatowoong.jpamultidatasource.config.db

import org.hibernate.cfg.AvailableSettings
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class HibernateConfig {

    @Bean
    fun hibernatePropertiesCustomizer(): HibernatePropertiesCustomizer {
        return HibernatePropertiesCustomizer { properties: MutableMap<String?, Any?> ->
            properties[AvailableSettings.STATEMENT_INSPECTOR] = CustomStatementInspector()
        }
    }
}