package proyecto_progra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dinat
 */
public class Utils {

    public static void escribirArchivo(String nombreArchivo, String datos) {
        try {
            File archivo = new File(nombreArchivo);
            FileWriter escribir = new FileWriter(archivo);
            BufferedWriter outStream = new BufferedWriter(escribir);
            outStream.write(datos);
            outStream.close();
        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo" + e);
        }
    }

    public static String leerArchivo(String nombreArchivo) {
        try {
            FileReader leer = new FileReader(nombreArchivo);
            BufferedReader inStream = new BufferedReader(leer);
            StringBuilder abc = new StringBuilder();
            String inString;
            while((inString = inStream.readLine()) != null) {
                abc.append(inString);
            }
            inStream.close();
            return abc.toString();
        } catch (IOException e) {
        }
        return null;
    }
}
