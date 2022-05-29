package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException{

        if(args[2].equals("crypt"))
        {
            if(args[3].equals("rot")) {
                Cryptographer v = new Cryptographer();
                ROT11 r = new ROT11();
                v.cryptfile(args[0], args[1], r);
            }
            else if(args[3].equals("Polibiusz")) {
                Cryptographer c = new Cryptographer();
                Polibiusz p = new Polibiusz();
                c.cryptfile(args[0], args[1], p);
            }
            else {
                System.out.println("Incorrect argument.");
            }
        }
        else if(args[2].equals("decrypt")){
            if(args[3].equals("rot"))
            {
                Cryptographer c = new Cryptographer();
                ROT11 r = new ROT11();
                c.decryptfile(args[0], args[1], r);
            } else if(args[3].equals("Polibiusz"))
            {
                Cryptographer c = new Cryptographer();
                Polibiusz r = new Polibiusz();
                c.decryptfile(args[0], args[1], r);
            }
            else{
                System.out.println("Incorrect argument.");
            }
        }
        else {
            System.out.println("Incorrect arguments.");
        }
            }
        }


