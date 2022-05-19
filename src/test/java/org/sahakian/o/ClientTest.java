package org.sahakian.o;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void send() {
        Client client = new Client(new Server());

        String res = client.send("Todo");

        assertEquals("Process Todo",res);
    }
}