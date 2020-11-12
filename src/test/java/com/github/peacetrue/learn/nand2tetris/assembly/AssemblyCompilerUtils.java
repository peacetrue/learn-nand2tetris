package com.github.peacetrue.learn.nand2tetris.assembly;

import com.github.peacetrue.learn.nand2tetris.Nand2tetrisUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author : xiayx
 * @since : 2020-11-07 16:44
 **/
@Slf4j
public abstract class AssemblyCompilerUtils {

    public static final Map<String, Integer> SYMBOLS = new HashMap<>();

    static {
        SYMBOLS.put("SP", 0);
        SYMBOLS.put("LCL", 1);
        SYMBOLS.put("ARG", 2);
        SYMBOLS.put("THIS", 3);
        SYMBOLS.put("THAT", 4);
        IntStream.rangeClosed(0, 15).forEach(i -> SYMBOLS.put("R" + i, i));
        SYMBOLS.put("SCREEN", 16384);
        SYMBOLS.put("KBD", 24576);
    }

    public static final Map<String, String> COMPS = new HashMap<>();

    static {
        COMPS.put("0", "0101010");
        COMPS.put("1", "0111111");
        COMPS.put("-1", "0111010");
        COMPS.put("D", "0001100");
        COMPS.put("A", "0110000");
        COMPS.put("M", "1110000");
        COMPS.put("!D", "0001101");
        COMPS.put("!A", "0110001");
        COMPS.put("!M", "1110001");
        COMPS.put("-D", "0001111");
        COMPS.put("-A", "0110011");
        COMPS.put("-M", "1110011");
        COMPS.put("D+1", "0011111");
        COMPS.put("A+1", "0110111");
        COMPS.put("M+1", "1110111");
        COMPS.put("D-1", "0001110");
        COMPS.put("A-1", "0110010");
        COMPS.put("M-1", "1110010");
        COMPS.put("D+A", "0000010");
        COMPS.put("D+M", "1000010");
        COMPS.put("D-A", "0010011");
        COMPS.put("D-M", "1010011");
        COMPS.put("A-D", "0000111");
        COMPS.put("M-D", "1000111");
        COMPS.put("D&A", "0000000");
        COMPS.put("D&M", "1000000");
        COMPS.put("D|A", "0010101");
        COMPS.put("D|M", "1010101");
    }

    public static final Map<String, String> JUMPS = new HashMap<>();

    static {
        JUMPS.put("JGT", "001");
        JUMPS.put("JEQ", "010");
        JUMPS.put("JGE", "011");
        JUMPS.put("JLT", "100");
        JUMPS.put("JNE", "101");
        JUMPS.put("JLE", "110");
        JUMPS.put("JMP", "111");
    }

    public static final String BASE_PATH = Nand2tetrisUtils.BASE_PATH + "/06";

    public static String format(String text) {
        return format(Integer.parseInt(text));
    }

    public static String format(int address) {
        return StringUtils.leftPad(Integer.toBinaryString(address), 15, '0');
    }
}
