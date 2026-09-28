package Ejercicio23_reportesFormatos;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> datos = Arrays.asList("Ventas 2026", "Total: 1250000");
        GeneradorReporte[] generadores = {new ReportePDF(), new ReporteExcel(), new ReporteHTML()};
        String[] nombres = {"PDF", "Excel", "HTML"};

        for (int i = 0; i < generadores.length; i++) {
            System.out.println("--- Exportando a " + nombres[i] + " ---");
            new SistemaGestion(generadores[i]).procesar(datos);
        }
    }
}
