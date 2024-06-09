package org.gfg.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("I am in hello handler");
        System.out.println("Request headers are: "+ exchange.getRequestMethod());
        String res = "I am returned from Hello using thread " + Thread.currentThread().getName();
        exchange.sendResponseHeaders(200, res.length());
        OutputStream os = exchange.getResponseBody();
        os.write(res.getBytes());
    }
}
