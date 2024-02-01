package src.soket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(8);
            ServerSocket socket = new ServerSocket(9393);
            while (true) {
                Socket accept = socket.accept();
                executorService.submit(() -> {
                    try {
                        try {
                            connection(accept);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void connection (Socket accept) throws IOException, InterruptedException {
        Thread.sleep(2000);
        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();

        StringBuilder message = new StringBuilder();
        byte [] buffer = new byte[1024];

        int bytesRead;
        while ((bytesRead = inputStream.read(buffer))!= - 1){
            message.append(new String(buffer, 0, bytesRead));
            if (message.toString().contains("\n")){
                break;
            }
        }
        String data = message.toString().trim();
        System.out.println(data);
        String name = data.split(",")[0].strip();
        outputStream.write("from kitchen : ok\n".getBytes());
        outputStream.flush();
    }
}
