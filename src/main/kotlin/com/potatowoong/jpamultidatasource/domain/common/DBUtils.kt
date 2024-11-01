package com.potatowoong.jpamultidatasource.domain.common

import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

object DBUtils {

    private const val SCHEMA_ATTRIBUTE = "schema"

    fun getSchemaName(): String {
        return getRequest()?.getAttribute(SCHEMA_ATTRIBUTE, 0) as? String ?: ""
    }

    fun setSchemaName(schemaName: String) {
        getRequest()?.setAttribute(SCHEMA_ATTRIBUTE, schemaName, 0)
    }

    private fun getRequest(): ServletRequestAttributes? {
        return RequestContextHolder.getRequestAttributes() as? ServletRequestAttributes
    }
}