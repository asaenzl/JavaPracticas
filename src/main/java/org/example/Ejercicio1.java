package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicio1 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        //Constantes horas
        int lunesPorHora = 10;
        int martesPorHora = 8;
        int miercolesPorHora = 9;
        int juevesPorHora = 7;
        int viernesPorHora = 11;
        int sabadoPorHora = 12;
        int domingoPorHora = 13;

        out.println("Horas trabajadas Lunes");
        int lunes = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Martes");
        int martes = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Miercoles");
        int miercoles = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Jueves");
        int jueves = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Viernes");
        int viernes = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Sabado");
        int sabado = Integer.parseInt(in.readLine());
        out.println("Horas trabajadas Domingo");
        int domingo = Integer.parseInt(in.readLine());

        //Calculo
        int horasTrabajadasLunes = lunes * lunesPorHora;
        int horasTrabajadasMartes = martes * martesPorHora;
        int horasTrabajadasMiercoles = miercoles * miercolesPorHora;
        int horasTrabajadasJueves = jueves * juevesPorHora;
        int horasTrabajadasViernes = viernes * viernesPorHora;
        int horasTrabajadasSabado = sabado * sabadoPorHora;
        int horasTrabajadasDomingo = domingo * domingoPorHora;

        //Suma de hora trabajadas
        int totalAPagar = horasTrabajadasLunes + horasTrabajadasMartes + horasTrabajadasMiercoles + horasTrabajadasJueves
                + horasTrabajadasViernes + horasTrabajadasSabado + horasTrabajadasDomingo;

        out.println("Monto Total a pagar al empleado " + totalAPagar);



    }
}
