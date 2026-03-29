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
public class Consulta {
    private String fecha;
    private String hora;
    private String motivo;
    private String diagnostico;
    private float pesoActualMascota;
    private Veterinario veterinario;
    private Mascota mascota;
    private ArrayList<Medicamento> receta;

    public Consulta() {
    }

    public Consulta(Veterinario veterinario, String fecha, String hora, String motivo, String diagnostico, float pesoActualMascota, Mascota mascota, ArrayList<Medicamento> receta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.pesoActualMascota = pesoActualMascota;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.receta = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public float getPesoActualMascota() {
        return pesoActualMascota;
    }

    public void setPesoActualMascota(float pesoActualMascota) {
        this.pesoActualMascota = pesoActualMascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public ArrayList<Medicamento> getReceta() {
        return receta;
    }

    public void setReceta(ArrayList<Medicamento> receta) {
        this.receta = receta;
    }
    
    public void agregarMedicamentoConsulta(String nombre, String dosis, String frecuencia){
        
        Medicamento recetado = new Medicamento(nombre, dosis, frecuencia);
        this.receta.add(recetado);
    }



}