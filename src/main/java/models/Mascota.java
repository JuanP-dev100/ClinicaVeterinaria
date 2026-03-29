/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


/**
 *
 * @author UNICARTAGENA
 */
public class Mascota extends Animal {
   
    private String alergias;
    private Medicamento medicacion;
    private String peso;
    private Propietario propietario;

    public Mascota() {
    }

    public Mascota(String alergias, Medicamento medicacion, String peso, Propietario propietario) {
        this.alergias = alergias;
        this.medicacion = medicacion;
        this.peso = peso;
        this.propietario = propietario;
    }

    public Mascota(String alergias, Medicamento medicacion, String peso, Propietario propietario, String especie, String nombre, int edad, String genero) {
        super(especie, nombre, edad, genero);
        this.alergias = alergias;
        this.medicacion = medicacion;
        this.peso = peso;
        this.propietario = propietario;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Medicamento getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(Medicamento medicacion) {
        this.medicacion = medicacion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    
    
    
    
}
