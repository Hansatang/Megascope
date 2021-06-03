package server;

import server.networking.Server;

import java.io.IOException;

public class RunServer {
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

