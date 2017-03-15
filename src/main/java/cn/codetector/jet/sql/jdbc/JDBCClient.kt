package cn.codetector.jet.sql.jdbc

import cn.codetector.jet.jetconfiguration.JetConfiguration
import cn.codetector.jet.jetsimplejson.JSONObject
import cn.codetector.jet.sql.SQLConnection

/**
 * Created by Codetector on 2017/3/15.
 * Project Jet
 */
interface JDBCClient {
    companion object {
        fun createSharedJDBCClient(config: JSONObject): JDBCClient {

        }

        fun createSharedJDBCClient(config: JetConfiguration): JDBCClient {

        }
    }
    suspend fun getConnection(): SQLConnection
    suspend fun close()
}