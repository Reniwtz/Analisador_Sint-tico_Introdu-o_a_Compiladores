package analisador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Maincup {

    public static void main(String[] args) throws Exception {

        String[] rotas = {"-parser", "Parser", "C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/Parser.cup"};
        criar(rotas);
    }

    public static void criar(String [] rotas) throws IOException, Exception {
        java_cup.Main.main(rotas);

        Path rotaSym = Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/sym.java");
        if (Files.exists(rotaSym)) {
            Files.delete(rotaSym);
        }
        Files.move(
                Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/sym.java"),
                Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/sym.java")
        );

        Path rotaSint = Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/Parser.java");
        if (Files.exists(rotaSint)) {
            Files.delete(rotaSint);
        }
        Files.move(
                Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/Parser.java"),
                Paths.get("C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/Parser.java")
        );
    }
}
