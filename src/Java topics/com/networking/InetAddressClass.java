package com.networking;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

// used to encapsulate the numerical IP address and the domain name for that address
// FACTORY METHODS
// 1st -> static InetAddress getLocalHost() throws UnknownHostException
    // simply returns the InetAddress instance that represent the localhost
// 2nd -> static InetAddress getByName(String hostName) throws UnknownHostException
    // returns the InetAddress for the hostname passed to it
// 3rd -> static InetAddress[] getAllByName(String hostName) throws UnknownHostException
    // returns an array of InetAddresses that represent all of the addresses that a particular
        // name resolves to
// 4th -> getByAddress -> takes an ip address and return an InetAddress object
public class InetAddressClass {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.google.com");
        System.out.println(inetAddress);

        // Instance methods
        byte[] address = inetAddress.getAddress();
        System.out.println(Arrays.toString(address));

        System.out.println(inetAddress.getHostAddress());

        System.out.println(inetAddress.getHostName());

        System.out.println(inetAddress.isMulticastAddress());
    }
}
