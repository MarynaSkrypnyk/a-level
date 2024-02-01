package src.soket;

import java.io.*;
import java.net.Socket;

public class Human {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9393);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.print("Order two burger\n");
        printWriter.flush();

        String data = bufferedReader.readLine();
        System.out.println(data);
        socket.close();
    }
}
