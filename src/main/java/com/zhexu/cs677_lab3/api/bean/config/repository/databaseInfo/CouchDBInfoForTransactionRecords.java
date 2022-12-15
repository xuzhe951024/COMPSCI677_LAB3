package com.zhexu.cs677_lab3.api.bean.config.repository.databaseInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @project: CS677_LAB3
 * @description:
 * @author: zhexu
 * @create: 12/15/22
 **/
@Component
public class CouchDBInfoForTransactionRecords {
    @Value(value = "${couchdb_transaction_records.host}")
    private String host;

    @Value(value = "${couchdb_transaction_records.port}")
    private String port;

    @Value(value = "${couchdb_transaction_records.database}")
    private String database;

    @Value(value = "${couchdb_transaction_records.username}")
    private String username;

    @Value(value = "${couchdb_transaction_records.password}")
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
