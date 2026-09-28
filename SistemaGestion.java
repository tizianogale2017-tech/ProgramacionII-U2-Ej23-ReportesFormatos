package Ejercicio23_reportesFormatos;

import java.util.List;

public class SistemaGestion {
    private GeneradorReporte generador;

    public SistemaGestion(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void procesar(List<String> datos) {
        String contenido = String.join(",", datos);
        generador.exportar(contenido);
    }
}
