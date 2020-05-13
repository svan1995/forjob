package io;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class IOClient {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Socket socket = new Socket("localhost", 6666);
                while (true){
                    try {
                        socket.getOutputStream().write((new Date() + " : hello, world").getBytes());
                        Thread.sleep(2000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }catch (IOException e){

            }
        }).start();
    }
}
