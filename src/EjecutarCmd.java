
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class EjecutarCmd {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Levanta mswlogo y carga el archivo cuadro.lgo.log pero no se ejecuta automaticamente
        //sino que debemos digitar la palabra cuadro en la caja de texto de logo.
        List<String> command = new ArrayList<>();
        command.add("cmd.exe");
        command.add("/c");
        command.add("cd \"C:\\Program Files (x86)\\mswlogoes65b\" && mswlogo.exe -l cuadro.lgo.log");
        ProcessBuilder process;
        process = new ProcessBuilder(command);
        process.redirectErrorStream(true);
        process.start();
        
        
        // O esta forma
        /*
         ProcessBuilder builder = new ProcessBuilder(
                    "cmd.exe", "/c", "cd \"C:\\Program Files (x86)\\mswlogoes65b\" && mswlogo.exe -l cuadro.lgo.log");
          builder.redirectErrorStream(true);
            builder.start();
        */
        
        
    }
                                   }
