package org.sahakian.o;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

    private Server server;
    @Test
    void sendServer1() {
        server = new ServerImpl();
        
        Client client = new Client(server);

        String res = client.send("Todo");

        assertEquals("Process Todo",res);
    }

    @Test
    void sendServer2(){
        server = new Server2Impl();

        Client client = new Client(server);

        String res = client.send("Todo");

        assertEquals("Server 2 process Todo",res);
    }
}