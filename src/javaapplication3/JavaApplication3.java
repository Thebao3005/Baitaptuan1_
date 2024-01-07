package javaapplication3;

import java.net.InetAddress;

/**
 *
 * @author Baobu Kiem tra keet noi internet
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        try {
            //lay dia chi ip cua 1 web
            InetAddress inet = InetAddress.getByName("www.google.com");
            boolean isKN = inet.isReachable(5000); //time ket noi 5s
            //in thong bao
            if (isKN) {
                System.out.println("Co internet");
            } else {
                System.out.println("Khong ket noi duoc internet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
