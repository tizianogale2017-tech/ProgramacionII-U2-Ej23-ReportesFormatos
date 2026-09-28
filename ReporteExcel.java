package Ejercicio23_reportesFormatos;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println("| Hoja1 |");
        System.out.println("| A1: " + contenido.replace(",", " | B1: ") + " |");
    }
}
