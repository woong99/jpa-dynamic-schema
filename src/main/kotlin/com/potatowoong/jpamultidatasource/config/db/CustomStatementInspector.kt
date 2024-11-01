package com.potatowoong.jpamultidatasource.config.db

import com.potatowoong.jpamultidatasource.domain.common.DBUtils
import com.potatowoong.jpamultidatasource.domain.common.SCHEMA_NAME_PLACEHOLDER
import org.hibernate.resource.jdbc.spi.StatementInspector

/**
 * StatementInspector를 상속받아서 inspect 메소드를 오버라이드하여
 * SCHEMA_NAME_PLACEHOLDER를 실제 스키마 이름으로 변경하는 클래스
 */
class CustomStatementInspector : StatementInspector {
    override fun inspect(sql: String?): String {
        return sql!!.replace(SCHEMA_NAME_PLACEHOLDER, DBUtils.getSchemaName())
    }
}