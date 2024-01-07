/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import sun.awt.EmbeddedFrame;

/**
 *
 * @author Baobu
 */
public class Bai3_GetAllipLocal {

    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
        while (netInterface.hasMoreElements()) {
            NetworkInterface networkInterface = netInterface.nextElement();
            Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
            while (inetAddress.hasMoreElements()) {
                InetAddress address = inetAddress.nextElement();
                System.out.println("Interface: "+ address.getHostAddress());
            }
        }
    }

}
