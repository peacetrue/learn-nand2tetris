package com.github.peacetrue.learn.nand2tetris;

import java.nio.file.Path;

/**
 * @author : xiayx
 * @since : 2020-11-07 16:42
 **/
public abstract class Nand2tetrisUtils {

    public final static String BASE_PATH = "/Users/xiayx/Documents/Projects/learn-nand2tetris/docs/antora/modules/ROOT/pages/nand2tetris/projects";

    public static Path resolve(Path path, String postfix) {
        String oldFileName = path.getFileName().toString();
        int lastIndex = oldFileName.lastIndexOf('.');
        return path.resolveSibling(oldFileName.substring(0, lastIndex) + "." + postfix);
    }
}
