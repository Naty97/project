package proyecto_progra;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import proyecto_progra.Utils;
import proyecto_progra.txtAdministrator;

/**
 *
 * @author dinat
 */
public class menuPrincipal {

    public static void main(String[] args) {
        /*Utils.escribirArchivo("administrador.txt", "1234");
        Utils.escribirArchivo("proyects.txt", "1234");
        */
    
        String usuario = Utils.leerArchivo("administrador.txt");
        menuPrincipal menu = new menuPrincipal();
        txtAdministrator administrador = menu.cargarAdministrador();
        menu.cargarAdministrador();
        String gerente= Utils.leerArchivo("administrador.txt");
        System.out.println(gerente);
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
        System.out.println("1.Ingresar.");
        System.out.println("2.Cambiar Contraseña.");
        System.out.println("3.Salir.");
        System.out.println("Ingrese opción que desea:");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Digite usuario:");
                    String user = entrada.next();
                    System.out.print("Digite contraseña:");
                    String contraseña = entrada.next();
                    System.out.print(user);
                    System.out.print(administrador.usuario);
                    System.out.print(user.equals(administrador.usuario));
                    if (user.equals(administrador.usuario) && contraseña.equals(administrador.password)){
                        System.out.print("Inicio de sesión exitoso!!");
                    }
                    break;
            }
        }
        while (opcion != 2);
    }
    public txtAdministrator cargarAdministrador(){
    String usuario = Utils.leerArchivo("administrador.txt");
    String[] parts = usuario.split(",");
    return new txtAdministrator(parts[0], parts[1]);
    }
    
    
    
/*        Scanner sc = new Scanner(System.in);
          ArrayList<Integer> administra = new ArrayList<>();
        int admin;
                try {
            File archivo = new File("C:\\Users\\dinat\\Documents\\NetBeansProjects\\Proyecto_Progra\\administrador.txt");

            if (archivo.createNewFile()) {
                System.out.println("se ha creado el archivo del administrador");
            }

            FileWriter escribir = new FileWriter(archivo);
            BufferedWriter outStream = new BufferedWriter(escribir);
            for (int k = 0; k < ListaAdmin.size(); k++) {
                outStream.write(ListaAdmin.get(k).toString() + ", ");
            }
            outStream.close();
            System.out.println("Data saved.");

            FileReader leer = new FileReader(archivo);
            BufferedReader inStream = new BufferedReader(leer);
            String inString = inStream.readLine();
            System.out.println(inString);
            inStream.close();

        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo" + e);
        }*/
}
