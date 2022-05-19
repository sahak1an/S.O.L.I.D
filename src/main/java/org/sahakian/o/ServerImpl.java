package org.sahakian.o;

public class ServerImpl implements Server {

    @Override
    public String processRequest(String req) {
      return "Process " + req;
    }
}
