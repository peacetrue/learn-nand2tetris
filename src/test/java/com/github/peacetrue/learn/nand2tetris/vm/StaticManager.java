package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : xiayx
 * @since : 2020-11-08 10:16
 **/
@NoArgsConstructor
public class StaticManager {

    private int index = 16;
    private final List<Address> addresses = new ArrayList<>();

    public StaticManager(int index) {
        this.index = index;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String source;
        private int relativeIndex;
        private int index;
    }

    public int index(String source, int relativeIndex) {
        Optional<Address> optional = addresses.stream()
                .filter(address -> address.getSource().equals(source) && address.getRelativeIndex() == relativeIndex)
                .findAny();
        if (optional.isPresent()) {
            return optional.get().index;
        } else {
            Address address = new Address(source, relativeIndex, index++);
            addresses.add(address);
            return address.getIndex();
        }
    }
}
