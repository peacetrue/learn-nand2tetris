package com.github.peacetrue.learn.nand2tetris.vm;

import com.github.peacetrue.learn.nand2tetris.Nand2tetrisUtils;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author : xiayx
 * @since : 2020-11-07 16:56
 **/
public class VMCompilerUtils {

    public final static String basePath07 = Nand2tetrisUtils.BASE_PATH + "/07";
    public final static String basePath08 = Nand2tetrisUtils.BASE_PATH + "/08";

    public static VMCompilerParser getVmCompilerParser(Path path) throws IOException {
        CharStream stream = CharStreams.fromPath(path);
        VMCompilerLexer lexer = new VMCompilerLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return new VMCompilerParser(tokenStream);
    }
}
