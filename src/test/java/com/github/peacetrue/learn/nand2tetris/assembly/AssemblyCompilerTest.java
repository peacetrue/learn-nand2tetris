package com.github.peacetrue.learn.nand2tetris.assembly;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 * @author : xiayx
 * @since : 2020-11-01 23:06
 **/
@Slf4j
class AssemblyCompilerTest {

    @Test
    void max() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/max/Max.asm"));
    }

    @Test
    void maxL() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/max/MaxL.asm"));
    }

    @Test
    void pong() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/pong/Pong.asm"));
    }

    @Test
    void pongL() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/pong/PongL.asm"));
    }

    @Test
    void Rect() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/rect/Rect.asm"));
    }

    @Test
    void RectL() throws Exception {
        compile(Paths.get(AssemblyCompilerUtils.BASE_PATH + "/rect/RectL.asm"));
    }

    private void compile(Path path) throws IOException {
        CharStream stream = CharStreams.fromPath(path);
        AssemblyCompilerLexer lexer = new AssemblyCompilerLexer(stream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AssemblyCompilerParser parser = new AssemblyCompilerParser(tokenStream);
        AssemblyCompilerParser.CommandsContext commands = parser.commands();
        String binaryCodes = commands.accept(new BinaryCodeVisitor());
        log.info("{}:\n{}", path, binaryCodes);
        String hack = path.getFileName().toString().replaceFirst("asm", "hack");
        Path hackPath = path.resolveSibling(hack);
        Files.write(hackPath, binaryCodes.getBytes(), WRITE, CREATE);
    }
}
