import grammar.Grammar;
import org.antlr.v4.runtime.*;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ParserGrammarLexer lexer = new ParserGrammarLexer(CharStreams.fromStream(new FileInputStream(new File("input.txt"))));
        TokenStream ctk = new CommonTokenStream(lexer);
        ParserGrammarParser parser = new ParserGrammarParser(ctk);
        ParserGrammarParser.StartContext prc = parser.start();
        ArrayList<String> list = parser.words;
        Grammar grammar = parser.grammar;
        System.out.print(prc);
    }
}
