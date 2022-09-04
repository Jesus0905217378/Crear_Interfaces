/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgClases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import PkgClases.ClsVendedores;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Jesus Alberto
 */
public class ClsPersona implements IPersona{
    
            List<ClsVendedores> Lista1 = new ArrayList();
            ClsVendedores ven = new ClsVendedores();
            
            List<ClsVendedores> Lista2 = new ArrayList();
            ClsVendedores ven2 = new ClsVendedores();
            

    @Override
    public String getNombre(String nombre) {//throws AccesoDatosEx {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre){// throws EscrituraDatosEx {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

            
    @Override
    public void llenar_informacion (){

       ven.setNombre("Miguel");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Rosa");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Karla");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Lucas");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Rocio");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);
       ven = new ClsVendedores();
       
       ven.setNombre("Laura");
       ven.setEnero(ram());
       ven.setFebrero(ram());
       ven.setMarzo(ram());
       Lista1.add(ven);

    }

    public void Prueba_CargarInfo () {
        for(ClsVendedores v : Lista2){
      
           System.out.print(v.getNombre()+"\t\t");
           System.out.print(v.getEnero()+"\t\t");
           System.out.print(v.getFebrero()+"\t\t");
           System.out.println(v.getMarzo()+"\t\t");
       }
         
    }

     @Override
    public void Cargar_informacion(String archiv) {
        
         File archivo = new File(archiv);
         try {
             BufferedReader entrada = new BufferedReader(new FileReader(archivo));
             String lectura;
             lectura = entrada.readLine();
             
             int NoLinea = 1;
              while(lectura != null){

                  ven2.setNombre(lectura);
                  lectura = entrada.readLine();
                  NoLinea++; 
                  ven2.setEnero(Double.parseDouble(lectura));
                  lectura = entrada.readLine();
                  NoLinea++; 
                  ven2.setFebrero(Double.parseDouble(lectura));
                  lectura = entrada.readLine();
                  NoLinea++; 
                  ven2.setMarzo(Double.parseDouble(lectura));
                  lectura = entrada.readLine();
                  NoLinea++; 
                  Lista2.add(ven2);
                  ven2 = new ClsVendedores();
            }
            entrada.close();
         } catch (FileNotFoundException e) {
             System.out.println("El archivo no existe");
         } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
         }
   
    }

    @Override
    public void guardar_informaion(String archiv) {
         File archivo = new File(archiv);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            
             for(ClsVendedores v : Lista1){
               salida.print(v.getNombre()+"\t\t");
               salida.print(v.getEnero()+"\t\t");
               salida.print(v.getFebrero()+"\t\t");
               salida.println(v.getMarzo()+"\t\t");
             }
            salida.close();
            System.out.println("Archivo cargado correctamente");
            
        } catch (IOException e) {
            System.out.println("Hubo un error al abrir o grabar el archivo");
        }
    }
   
    public static double ram(){
        double numero = (double)(Math.random()*2000+1);
        return Double.parseDouble(d.format(numero));
    }
   
    private static  DecimalFormat d = new DecimalFormat("###.##");
}
