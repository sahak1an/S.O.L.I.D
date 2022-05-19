package org.sahakian.o;

public class Server2Impl implements Server{
    @Override
    public String processRequest(String req) {
        return "Server 2 process "+ req;
    }
}
