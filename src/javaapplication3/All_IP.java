/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author Baobu
 */
public class All_IP {

    public static void main(String[] args) {
        try {
            //Lay tat ca cac internet cua may
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            while (netInterface.hasMoreElements()) {
                NetworkInterface networkInterface = netInterface.nextElement();
                //lay danh sach dia chi Ip cua cac giao dien mang
                Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
                //duyet qua tung dia chi IP va in ra man hinh
                while (inetAddress.hasMoreElements()) {
                    InetAddress address = inetAddress.nextElement();
                    System.out.println("Interface: " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
