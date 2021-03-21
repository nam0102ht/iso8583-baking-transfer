package com.ntnn.database;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Log4j2
public class DatabaseUtils {

    public static Properties getConnection() {
        Properties properties = new Properties();
        try {
            InputStream input = DatabaseUtils.class.getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                log.warn("Sorry, unable to find config.properties");
                return properties;
            }
            properties.load(input);
        } catch (IOException ex) {
            log.error(ex.getMessage());
        }
        return properties;
    }

    public static JDBCClient connect(Vertx vertx) {
        Properties properties = DatabaseUtils.getConnection();
        JsonObject mSQLClientConfig = new JsonObject()
                .put("url", properties.getProperty("database.url"))
                .put("driverClass", properties.getProperty("database.driverClass"))
                .put("user", properties.getProperty("database.username"))
                .put("password", properties.getProperty("database.password"));
        JDBCClient mSQLClient = JDBCClient.createShared(vertx, mSQLClientConfig);
        return mSQLClient;
    }
}
