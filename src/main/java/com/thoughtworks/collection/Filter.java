package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        // throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (Integer i : array) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (Integer i : array) {
            if (i % 3 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        for (Integer i : firstList) {
            if (secondList.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getDifferentElements() {
        //throw new NotImplementedException();
        Set<Integer> temp = new HashSet<>();
        for (Integer i : array) {
            temp.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer i : temp) {
            result.add(i);
        }
        return result;

    }
}