package org.gfg.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.http.HttpClient;
import java.util.concurrent.Executors;

public class HttpServerDemo {

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 9091), 0);
        httpServer.setExecutor(Executors.newFixedThreadPool(4));

        httpServer.createContext("/hello", new HelloHandler());
        httpServer.createContext("/bye", new HelloHandler());
        httpServer.createContext("/abc", new HelloHandler());
        httpServer.createContext("/def", new HelloHandler());

        httpServer.start();
    }

}
