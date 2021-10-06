package com.rvbenlg.adventofcode.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static List<String> readInput(String inputName) throws IOException {
        String inputPath = "src\\main\\resources\\inputs\\" + inputName;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
        List<String> result = new ArrayList<>();
        String currentLine;
        while((currentLine = bufferedReader.readLine()) != null){
            result.add(currentLine);
        }
        bufferedReader.close();
        return result;
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}