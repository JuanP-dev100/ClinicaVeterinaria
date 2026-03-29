/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import models.Consulta;
import models.Mascota;
import models.Medicamento;
import models.Propietario;
import models.Veterinario;

/**
 *
 * @author UNICARTAGENA
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {

    Propietario p1 = new Propietario(44555, "Juan Giraldo", 20, 315777222, "juan@gmail.com", "calle20", "10", "2","10001");
    
        Mascota mascota1 = new Mascota("Ninguna", null, "15kg", p1, "Perro", "Firulais", 3, "Macho");
        Mascota mascota2 = new Mascota("Polen", null, "4kg", p1, "Gato", "Michi", 2, "Hembra");
        
        p1.agregarMascota(mascota1);
        p1.agregarMascota(mascota2);
        
        Veterinario vet = new Veterinario(98765, "Dra. Juanita Perez", 35, "Mañana", "ana@vet.com", 5559999, "General");
        
        Consulta consulta1 = new Consulta(vet, "29/03/2026", "10:00 AM", "Control de rutina", "Sano y fuerte", 15.0f, mascota1, new ArrayList<>());
        
        Medicamento med1 = new Medicamento("Vitaminas Caninas", "5ml", "Cada 24 horas");
        
        consulta1.agregarMedicamentoConsulta(med1.getNombre(), med1.getDosis(), med1.getFrecuencia());    
        
       System.out.println("========================================");
       System.out.println("       REPORTE DE LA CLINICA            ");
       System.out.println("========================================"); 
        
       System.out.println("\n[PROPIETARIO REGISTRADO]");
       System.out.println("Nombre: " + p1.getNombre() + " | Email: " + p1.getEmail());
       System.out.println("Sus Mascotas:");
       for(Mascota m : p1.getMascotas()) {
            System.out.println(" -> " + m.getNombre() + " (" + m.getEspecie() + " - " + m.getGenero() + ")");
        } 
        System.out.println("\n[CONSULTAS REALIZADAS]");
        System.out.println("Fecha: " + consulta1.getFecha() + " | Hora: " + consulta1.getHora());
        System.out.println("Paciente: " + consulta1.getMascota().getNombre());
        System.out.println("Atendido por: " + consulta1.getVeterinario().getNombre());
        System.out.println("Motivo: " + consulta1.getMotivo());
        System.out.println("Diagnostico: " + consulta1.getDiagnostico());
        
        System.out.println("\n[MEDICAMENTOS RECETADOS EN LA CONSULTA]");
        if (consulta1.getReceta().isEmpty()){
            System.out.println("No se recetaron medicamentos.");
        } 
        else{
            for(Medicamento m : consulta1.getReceta()){
                System.out.println(" Medicamento: " + m.getNombre() + " | Dosis: " + m.getDosis() + " | Frecuencia: " + m.getFrecuencia());
            }
        }
        
    }
}
