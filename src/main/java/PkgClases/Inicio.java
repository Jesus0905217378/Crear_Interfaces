/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PkgClases;
import PkgClases.ClsPersona;
/**
 *
 * @author Jesus Alberto
 */
public class Inicio {
        public static void main(String[] args) {
        ClsPersona CargarInfo = new ClsPersona();
        
        CargarInfo.llenar_informacion();
        //CargarInfo.Cargar_informacion("C:\\Users\\Jesus Alberto\\Desktop\\Prueba clase7\\Vendedores.txt");
        //CargarInfo.Prueba_CargarInfo();
        
        CargarInfo.guardar_informaion("C:\\Users\\Jesus Alberto\\Desktop\\Prueba clase7\\Guardar Vendedores.txt");
    }
}
