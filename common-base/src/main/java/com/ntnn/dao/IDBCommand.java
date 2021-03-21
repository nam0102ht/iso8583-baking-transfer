package com.ntnn.dao;

import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;


public interface IDBCommand {
    void select(JsonObject data, Handler<JsonObject> whenDone);
    void selectById(JsonObject data, Handler<JsonObject> whenDone);
    void insert(JsonObject data, Handler<JsonObject> whenDone);
    void update(JsonObject data, Handler<JsonObject> whenDone);
    void delete(JsonObject data, Handler<JsonObject> whenDone);
    void upsert(JsonObject data, Handler<JsonObject> whenDone);
}
