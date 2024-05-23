package com.Brian_AS.facturacion;

import com.google.gson.Gson;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(4567);

        get("/hello", (req, res) -> "Hello, World");

        get("/facturas", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson(new String[]{"Factura 1", "Factura 2"});
        });

        post("/facturas", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson("Factura creada");
        });
    }
}