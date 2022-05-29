package com.company;

import java.util.ArrayList;
import java.util.List;

public class Polibiusz implements Algorithm {

    char[][] matrix = { {'a','b','c','d','e','j'},{'f','g','h','i','k', ','},{'l','m','n','o','p', '.'},{'q','r','s','t','u','?'},{'v','w','x','y','z', '!'}};
    @Override
    public String crypt(String inputWord) {

        String res = "";
        inputWord = inputWord.toLowerCase();
        var temp = new char[inputWord.length()];
        temp = inputWord.toCharArray();
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        for (int i = 0; i < inputWord.length(); i++)
        {
            for(int j = 0; j < len1; j++) {
                for (int k = 0; k < len2; k++) {
                    if(matrix[j][k] == temp[i])
                    {
                        res += String.valueOf(j + 1) +  String.valueOf(k + 1);
                        break;
                    }
                }
            }
        }
        return  res;
    }
    @Override
    public String decrypt(String inputWord) {

        String res = "";
        List<String> tokens = new ArrayList<>();
        int size = 2;
        for (int start = 0; start < inputWord.length(); start += size) {
            tokens.add(inputWord.substring(start, Math.min(inputWord.length(), start + size)));
        }
        for (String s: tokens)
        {
            s.substring(0,1);
            int i = Integer.parseInt(s.substring(0,1))-1;
            int j = Integer.parseInt(s.substring(1))-1;
            res += matrix[i][j];

        }
        return  res;



    }
}
