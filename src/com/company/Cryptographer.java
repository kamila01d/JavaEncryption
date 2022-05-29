package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;

public class Cryptographer {

    public void cryptfile(String path_to_file_in, String path_to_file_out, Algorithm algorithm) throws FileNotFoundException {
        FileReader fl = new FileReader(path_to_file_in);
        Scanner plik = new Scanner(fl);
        String s;

        File out = new File(path_to_file_out);
        PrintWriter zapis = new PrintWriter(out);
        while (plik.hasNext()) {
            s = plik.nextLine();
            String[] tab = s.split(" ");

            for (int i = 0; i < tab.length; i++) {
                tab[i] = algorithm.crypt(tab[i]);
                zapis.print(tab[i] + " ");
            }
            zapis.print("\n");
        }
        zapis.close();
        plik.close();


    }

    public void decryptfile(String path_to_file_in, String path_to_file_out, Algorithm algorithm) throws FileNotFoundException {

        FileReader fl = new FileReader(path_to_file_in);
        Scanner plik = new Scanner(fl);
        String s;

        File out = new File(path_to_file_out);
        PrintWriter zapis = new PrintWriter(out);
        while (plik.hasNext()) {
            s = plik.nextLine();
            String[] tab = s.split(" ");

            for (int i = 0; i < tab.length; i++) {
                tab[i] = algorithm.decrypt(tab[i]);
                zapis.print(tab[i] + " ");
            }
            zapis.print("\n");
        }
        zapis.close();
        plik.close();

    }
}



