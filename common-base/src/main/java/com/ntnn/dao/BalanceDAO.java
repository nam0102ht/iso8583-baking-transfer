package com.ntnn.dao;

import com.ntnn.model.User;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class BalanceDAO implements  IDBCommand{
    private Vertx vertx;
    private User user;

    public BalanceDAO(Vertx vertx, User user) {
        this.vertx = vertx;
        this.user = user;
    }
    @Override
    public void select(JsonObject data, Handler<JsonObject> whenDone) {

    }

    @Override
    public void selectById(JsonObject data, Handler<JsonObject> whenDone) {

    }

    @Override
    public void insert(JsonObject data, Handler<JsonObject> whenDone) {

    }

    @Override
    public void update(JsonObject data, Handler<JsonObject> whenDone) {

    }

    @Override
    public void delete(JsonObject data, Handler<JsonObject> whenDone) {

    }

    @Override
    public void upsert(JsonObject data, Handler<JsonObject> whenDone) {

    }
}
