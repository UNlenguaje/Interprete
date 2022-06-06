import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        LenguajeLexer lexer = new LenguajeLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LenguajeParser parser = new LenguajeParser(tokens);
        ParseTree tree = parser.inicio();

        MyVisitor loader = new MyVisitor();
        loader.visit(tree);

    }
}
