/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal
 * @author Barillas
 */
public class MPOOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println("Se creo = " + seCreo);
            System.out.println(archivo.exists());
            } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n########### File Write ###########");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba un texto para el archivo: ");
            String texto = br.readLine();
            
            FileWriter fw = new FileWriter("fw.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            for (int i = 0; i < 10; i++) {
                salida.println("linea del for " + i);
            }
            salida.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n########### File Write ###########");
        try {
            FileReader fr = new FileReader("fw.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es ");
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n########### String Tokenizer ###########");
        Platillo platillo = new Platillo();
        float temp = 0;
        String textoTemporal;
        String linea = "Enchiladas,50.44,Pollo/crema/queso";
        StringTokenizer tokenizador = new StringTokenizer(linea, ",");
        while (tokenizador.hasMoreTokens()) {
            textoTemporal = tokenizador.nextToken();
            if (temp == 0)
                platillo.setNombre(textoTemporal);
            else if (temp == 1)
                platillo.setPrecio(Double.parseDouble(textoTemporal));
            else if (temp == 2)
                platillo.setIngredientes(textoTemporal);
            System.out.println(textoTemporal);
            temp++;
        }
        System.out.println(platillo);
        
        System.out.println("\n########### String Tokenizer ###########");
        Alumno listaAlumnos[] = new Alumno[10];
        FileReader frA = new FileReader("listaAlumnos.csv");
        BufferedReader brA = new BufferedReader(frA);
        String linea1 = brA.readLine();
        Scanner sc = new Scanner(brA);
        for (int i = 0; i < listaAlumnos.length; i++){
            StringTokenizer tokenizador1 = new StringTokenizer(linea1, ",");
            temp = 0;
            listaAlumnos[i] = new Alumno();
            while (tokenizador1.hasMoreTokens()) {
                textoTemporal = tokenizador1.nextToken();
                if (temp == 0)
                    listaAlumnos[i].setNombre(textoTemporal);
                else if (temp == 1)
                    listaAlumnos[i].setApPat(textoTemporal);
                else if (temp == 2)
                    listaAlumnos[i].setApMat(textoTemporal);
                else if (temp == 3)
                    listaAlumnos[i].setNumCuenta(Long.parseLong(textoTemporal));
                else if (temp == 4)
                    listaAlumnos[i].setEdad(Integer.parseInt(textoTemporal));
                temp++;
            }
            System.out.println(listaAlumnos[i]);
            try {
                linea1 = sc.nextLine();
            }catch (java.util.NoSuchElementException ex){}       
        }
        sc.close();
        System.out.println(Arrays.toString(listaAlumnos));
    }
    
}
