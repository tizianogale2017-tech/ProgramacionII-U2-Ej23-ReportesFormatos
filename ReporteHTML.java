package Ejercicio23_reportesFormatos;

public class ReporteHTML implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println("<html><body>");
        System.out.println("  <p>" + contenido + "</p>");
        System.out.println("</body></html>");
    }
}
