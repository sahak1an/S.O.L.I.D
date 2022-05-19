package org.sahakian.o;

public class Client {
    private final Server server;

    public Client(Server server) {
        this.server = server;
    }

    public String send(String req){
        return server.processRequest(req);
    }
}
