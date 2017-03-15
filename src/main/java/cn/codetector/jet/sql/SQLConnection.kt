package cn.codetector.jet.sql

import cn.codetector.jet.jetsimplejson.JSONArray
import cn.codetector.jet.sql.result.ResultSet

/**
 * Created by Codetector on 2017/3/15.
 * Project Jet
 */
interface SQLConnection {
    suspend fun setAutoCommit(autoCommit: Boolean)
    suspend fun query(sql: String): ResultSet
    suspend fun queryWithParams(sql: String, args: JSONArray): ResultSet
    suspend fun update(sql: String): ResultSet
    suspend fun updateWithParams(sql: String, args: JSONArray): ResultSet
}