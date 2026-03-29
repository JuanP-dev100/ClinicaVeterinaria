/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author UNICARTAGENA
 */
public class Propietario {
    private int cedula;
    private String nombre;
    private int edad;
    private int telefono;
    private String email;
    
    private ArrayList<Mascota> mascotas;
    private Direccion direccion;

    public Propietario() {
    }

    public Propietario(int cedula, String nombre, int edad, int telefono, String email, String calle, String numero, String piso, String codigoPostal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
        this.mascotas = new ArrayList<>();
        this.direccion = new Direccion(calle, numero, piso, codigoPostal);
    }
//continuar
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
   public void setCedula(int cedula) {
        this.cedula = cedula;
   }
    public int getCedula(){
       return cedula;
   }

    public void agregarMascota(Mascota pelusa){
     this.mascotas.add(pelusa);
    }

     }
