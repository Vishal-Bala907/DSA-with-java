package topics.com.networking.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
* the following program provide a simple Socket example
* It opens a connection to a "whois" port (43) on the interNIC server, sends the cmd line argument
* down the socket, and then prints the data that is returned
*
* The InterNIC server will look up the argument as a registered internet domain name, and then sends
* back the IP add. and the contact information for that site
* */
public class SocketExampleOne {
    public static void main(String[] args) throws Exception {
        int c;
        Socket socket = new Socket("whois.internic.net",43);
        InputStream stream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        // construct a request string
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        // convert to bytes
        byte[] buf = str.getBytes();

        // send request
        outputStream.write(buf);

        // read and display the response
        while((c=stream.read()) != -1) {
            System.out.print((char) c);
        }

        socket.close();
    }
}
