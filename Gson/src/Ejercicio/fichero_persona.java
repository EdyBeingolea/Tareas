package Ejercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class fichero_persona {
    
    public static void main(String[] args) {
        String json = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("ejemplo.json"));
        
            String linea;
            while((linea = br.readLine()) != null){
                json += linea;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fichero_persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fichero_persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(json);
    }
}
