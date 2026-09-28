package Ejercicio23_reportesFormatos;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println("%PDF-1.4 | Página 1");
        System.out.println("  " + contenido);
        System.out.println("%%EOF");
    }
}
