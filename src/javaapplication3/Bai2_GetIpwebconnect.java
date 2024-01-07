/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.net.InetAddress;

/**
 *
 * @author Baobu
 */
public class Bai2_GetIpwebconnect {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            System.out.println("Dia chi ip cua web www.google.com la: " + inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
