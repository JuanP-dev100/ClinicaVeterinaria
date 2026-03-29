/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author UNICARTAGENA
 */
public class Veterinario {
    private int cedula;
    private String nombre;
    private int edad;
    private String turno;
    private String email;
    private int telefono;
    private String especialidad;

    public Veterinario() {
    }

    public Veterinario(int cedula, String nombre, int edad, String turno, String email, int telefono, String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void recetar(String nombre, String dosis, String frecuencia){
        Medicamento recetado = new Medicamento(nombre, dosis, frecuencia);
        
        this.receta.add.(recetado);
        
    }
    
    
}
