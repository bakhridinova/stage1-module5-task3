package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(elem -> elem % 2 == 0).toList();
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        List<Integer> innerMinList = new ArrayList<>();
        list.forEach(innerList -> innerMinList.add(innerList.stream().min(Integer::compare).get()));
        return innerMinList.stream().min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
