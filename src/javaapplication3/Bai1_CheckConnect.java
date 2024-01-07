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
public class Bai1_CheckConnect {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            Boolean isKN = inet.isReachable(5000);
            if (isKN) {
                System.out.println("Co ket noi internet");
            } else {
                System.out.println("Khong co ket noi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
