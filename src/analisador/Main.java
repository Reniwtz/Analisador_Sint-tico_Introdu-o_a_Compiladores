package analisador;

import java.io.File;

public class Main {

    public static void main(String[] args)  {
        String rota = "C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/Lexico.flex";
        String rota2 = "C:/Users/renil/OneDrive/Documentos/NetBeansProjects/Analisador/src/analisador/LexicoCup.flex";
        gerar(rota, rota2);
    }

    public static void gerar(String rota, String rota2) {
        File arquivo;
        arquivo = new File(rota);
        JFlex.Main.generate(arquivo);
        arquivo = new File(rota2);
        JFlex.Main.generate(arquivo);
    }
}
