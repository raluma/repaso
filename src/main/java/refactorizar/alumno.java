/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizar;

import java.util.Scanner;

/**
 *
 * @author 1cfgs
 */
public class alumno {
 /**
     * @return the nombre
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    @Override
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    @Override
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
   
    private String nombre;
    private String apellidos;
    private String dni;
      
       public alumno(){
    }
   public static void main(String []args){
       System.out.println("version 1.1");
       alumno objeto=new alumno();
       Scanner teclado=new Scanner(System.in);
       System.out.println("introduce el nombre");
       objeto.setNombre(teclado.nextLine());
       System.out.println("introduce el apellido");
       objeto.setApellidos(teclado.nextLine());
       System.out.println("introduce el dni");
       objeto.setDni(teclado.nextLine());
       System.out.println("alumno:"+objeto.getNombre()+"apellidos"+objeto.getApellidos()+"dni"+objeto.getDni());
   }      
}
