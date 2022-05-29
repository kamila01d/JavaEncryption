package com.company;
import java.lang.Math;
public class ROT11 implements Algorithm {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static int rot = 11;

    @Override
    public String crypt(String inputWord) {

        int size = inputWord.length();

        char[] temp = inputWord.toCharArray();

        char[] alf = alphabet.toCharArray();


        for (int i = 0; i < size; i++) {

            if (alphabet.indexOf(temp[i]) != -1) {
                temp[i] = alf[(alphabet.indexOf(temp[i]) + rot) % alphabet.length()];
            }
        }
        String result;
        result = String.valueOf(temp);
        return result;
    }

    @Override
    public String decrypt(String inputWord) {

        int size = inputWord.length();

        char[] temp = inputWord.toCharArray();

        char[] alf = alphabet.toCharArray();


        for(int i = 0; i <size; i++)
        {
            if (alphabet.indexOf(temp[i]) != -1) {
                if ((alphabet.indexOf(temp[i]) - rot) < 0) {
                    int x = Math.abs((alphabet.indexOf(temp[i]) - rot));
                    temp[i] = alf[alphabet.length() - x];

                } else {

                    temp[i] = alf[(alphabet.indexOf(temp[i]) - rot)];
                }
            }
        }
        String result;
        result = String.valueOf(temp);

        return result;
    }
}

