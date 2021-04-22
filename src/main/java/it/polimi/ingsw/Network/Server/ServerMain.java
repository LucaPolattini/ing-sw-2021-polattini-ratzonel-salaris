package it.polimi.ingsw.Network.Server;

import java.io.IOException;

public class ServerMain
{
    public static void main( String[] args )
    {
        MultiEchoServer server = new MultiEchoServer(1337);
        try {
            server.startServer();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
