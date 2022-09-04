/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PkgClases;
//import PkgClases.ClsVendedores;

//import excepciones.AccesoDatosEx;
//import excepciones.EscrituraDatosEx;
//import excepciones.LecturaDatosEx;

/**
 *
 * @author Jesus Alberto
 */
public interface IPersona {
    public String getNombre(String nombre) ;
    public void setNombre(String nombre);
    
    public void llenar_informacion();
    public void Cargar_informacion(String archivo);
    public void guardar_informaion(String archivo);
    
}
