# There are two kinds of TCP sockets in java. one for the server and the other is for the clients

 The **ServerSocket** class is designed to be as 'listener' which waits for the 
 clients to connect before doing anything thus **ServerSocket** is for servers
 
The **Socket** class is for the clients. it is designed to connect to server sockets
and initiate protocol exchange

The creation of a socket object implicitly establishes a connection between the 
client and the server

## constructors to create client sockets

1. Socket(String hostName , int port) throws UnknownHostException , IOException
2. Socket(InetAddress IpAddress , int port) throws UnknownHostException , IOException

## Some usefull methods
1. connect() -> to establish a new connection
2. isConnected()
3. isBound() -> return true if socket is bound to a connection\]
4. isClosed()
5. close()

