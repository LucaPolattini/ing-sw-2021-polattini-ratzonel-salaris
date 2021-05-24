package it.polimi.ingsw.Network.Client;

import it.polimi.ingsw.Network.Messages.Messanger;
import it.polimi.ingsw.Network.Messages.SocketMessage;
import it.polimi.ingsw.Observer.ViewObserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client extends Messanger implements ViewObserver{

    private String ip;
    private String nickname;
    private int port;
    private int ID=1;
    private Socket socket;
    Scanner stdin = new Scanner(System.in);
    private ObjectOutputStream socketOut;
    private ObjectInputStream socketIn;
    private UserInterface userInterface;
    private boolean active = true;


    public Client(String ip, int port, UserInterface userInterface) {
        this.ip = ip;
        this.port = port;
        this.userInterface=userInterface;
    }


    public synchronized boolean isActive() {
        return active;
    }
    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setSocketOut(ObjectOutputStream socketOut) {
        this.socketOut = socketOut;
    }

    public void setSocketIn(ObjectInputStream socketIn) {
        this.socketIn = socketIn;
    }



    public synchronized void setActive(boolean active) {
        this.active = active;
    }

    public synchronized void receiveMessage(SocketMessage message) throws IOException {
        System.out.println("messaggio ricevuto: " + message.getID() + "destinato a: "+ message.getReceiver());
        if(message.getReceiver()==null || message.getReceiver().contains(this.nickname)){
            switch (message.getID()){
                case "connected":
                    userInterface.askMultiplayer(stdin);
                    break;
                case "numberOfPlayers":
                    userInterface.askNumberOfPlayers(stdin);
                    break;
                case "waiting":
                    System.out.println("Waiting for other players...");
                    break;
                case "GameStarted":
                    System.out.println("   MAESTRI DEL MEDIOEVO!    \n" +
                            "(game started!) ");
                    break;
                default:
                    break;
            }
        }
    }

    /*public Thread asyncReadFromSocket(final ObjectInputStream socketIn) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (isActive()) {
                        Object inputObject = socketIn.readObject();
                        if (inputObject instanceof String) {
                            System.out.println((String) inputObject);
                        } else if (inputObject instanceof Board) {
                            ((Board) inputObject).print();
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                } catch (Exception e) {
                    setActive(false);
                }
            }
        });
        t.start();
        return t;
    }

    public Thread asyncWriteToSocket(final Scanner stdin, final PrintWriter socketOut) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (isActive()) {
                        String inputLine = stdin.nextLine();
                        socketOut.println(inputLine);
                        socketOut.flush();
                    }
                } catch (Exception e) {
                    setActive(false);
                }
            }
        });
        t.start();
        return t;
    }
*/

    public void run() throws IOException {
        userInterface.askNickname(stdin);
        userInterface.askOnline(stdin);
            try {

                SocketMessage message=(SocketMessage)socketIn.readObject();
                receiveMessage(message);
                message=(SocketMessage)socketIn.readObject();
                receiveMessage(message);

                while(true){
                    message=(SocketMessage)socketIn.readObject();
                    receiveMessage(message);
                }
                /*System.out.println("Quanto vuoi che valga A?");
                int a=stdin.nextInt();
                socketOut.writeObject(a);

                SocketMessage b= (SocketMessage)socketIn.readObject();
                receiveMessage(b);*/
            } catch (NoSuchElementException | ClassNotFoundException e) {
                System.out.println("Connection closed from the client side");
            } finally {
                stdin.close();
                socketIn.close();
                socketOut.close();
                socket.close();
            }
    }

    @Override
    public void updateOnline(boolean online) throws IOException {
     if(online){
         Socket socket = new Socket(ip, port);
         System.out.println("Connection established");
         setSocket(socket);
         setSocketOut(new ObjectOutputStream(socket.getOutputStream()));
         setSocketIn(new ObjectInputStream(socket.getInputStream()));
     }
     else
         System.out.println("OFFLINE GAME SELECTED!");
    }

    @Override
    public void updateMultiplayer(boolean multiplayer) throws IOException {
        if(multiplayer){
            sendMessage(this.socketOut,new SocketMessage("newMulti",1,null,nickname));
        }
        else
            sendMessage(this.socketOut,new SocketMessage("newMulti",0,null,nickname));
    }
    @Override
    public void updateNickname(String nickname){
        this.nickname=nickname;
    }
    @Override
    public void updateNumberOfPlayers(int numberOfPlayers) throws IOException {
        System.out.println("Number of players set, waiting for them to connect...");
        sendMessage(this.socketOut,new SocketMessage("numberOfPlayersReply",numberOfPlayers,null,nickname));
    }
}

