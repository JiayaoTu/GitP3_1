package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        // throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (Integer i : array) {
            result.add(i * 3);
        }
        return result;

    }

    public List<String> mapLetter() {
        // throw new NotImplementedException();
        List<String> result = new ArrayList<>();
        for (Integer i : array) {

            int temp = i + 96;
            char c = (char) temp;
            String s = String.valueOf(c);
            result.add(s);

        }
        return result;
    }

    public List<String> mapLetters() {
        // throw new NotImplementedException();
        List<String> result = new ArrayList<>();
        for (Integer i : array) {
            if (i >= 1 && i <= 26) {
                int temp = i + 96;
                char c = (char) temp;
                String s = String.valueOf(c);
                result.add(s);
            } else if (i > 26 && i <= 52) {
                int temp = i - 26 + 96;
                char c = (char) temp;
                String s = "a" + String.valueOf(c);
                result.add(s);
            } else {
                int temp = i - 26 * 2 + 96;
                char c = (char) temp;
                String s = "b" + String.valueOf(c);
                result.add(s);
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();

        Collections.sort(array);
        for (int i = array.size() - 1; i >= 0; i--) {
            result.add(array.get(i));
        }
        return result;
    }

    public List<Integer> sortFromSmall() {
        //throw new NotImplementedException();
        Collections.sort(array);
        return array;
    }
}
