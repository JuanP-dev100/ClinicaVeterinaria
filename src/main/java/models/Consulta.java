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
    



}