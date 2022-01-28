package clientApp;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientApp {
   
   BufferedReader in;
   BufferedWriter out;
   
   ClientApp(){
      try {
         
         Socket sock = new Socket("localhost", 50000);
         
         in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
         out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
         
         new MyThread().start();
         
         Scanner sc = new Scanner(System.in);
         
         while(true)
         {
            out.write(sc.next() + "\n");
            out.flush();
         }
         
         //sc.close();
         //sock.close();
      }
      catch(IOException e) {
         e.printStackTrace();
      }
   }
   
   class MyThread extends Thread {
      public void run() {
         while(true)
         {
            try {
               System.out.println(in.readLine());
            }
            catch(IOException e)
            {
               e.printStackTrace();
            }
         }
      }
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new ClientApp();
   }
}