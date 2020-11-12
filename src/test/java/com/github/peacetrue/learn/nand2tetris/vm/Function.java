package com.github.peacetrue.learn.nand2tetris.vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : xiayx
 * @since : 2020-11-07 15:28
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Function {
    private String name;
    private int localCount;
    private int lineNumber;
}
