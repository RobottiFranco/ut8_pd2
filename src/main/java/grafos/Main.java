package grafos;

public class Main {
    public static void main(String[] args) {

        // CARGAR GRAFO
        TGrafoNoDirigido gndej1g1 = (TGrafoNoDirigido) UtilGrafos.cargarGrafo(
                "ej1p5g1_vertices.txt",
                "ej1p5g1_aristas.txt",
                false, TGrafoNoDirigido.class);

        // CARGAR GRAFO
        TGrafoNoDirigido gndej1g2 = (TGrafoNoDirigido) UtilGrafos.cargarGrafo(
                "ej1p5g2_vertices.txt",
                "ej1p5g2_aristas.txt",
                false, TGrafoNoDirigido.class);

        // PRIM
        // ------------------------------------------------------------------------------------------------------------------------------------------------------------------
        TGrafoNoDirigido prim1 = gndej1g1.Prim();
        // AAM
        Double[][] matrizAdyacenciasPrim1 = UtilGrafos.obtenerMatrizCostos(prim1.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizAdyacenciasPrim1, prim1.getVertices(), "AAM Prim");

        TGrafoNoDirigido prim2 = gndej1g2.Prim();
        // AAM
        Double[][] matrizAdyacenciasPrim2 = UtilGrafos.obtenerMatrizCostos(prim2.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizAdyacenciasPrim2, prim2.getVertices(), "AAM Prim");

        // KRUSKAL
        // ----------------------------------------------------------------------------------------------------------------------------------------------------------------
        TGrafoNoDirigido kruskal1 = gndej1g1.Kruskal();
        // AAM
        Double[][] matrizAdyacenciasKruskal1 = UtilGrafos.obtenerMatrizCostos(kruskal1.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizAdyacenciasKruskal1, prim1.getVertices(), "AAM Kruskal");

        TGrafoNoDirigido kruskal2 = gndej1g2.Kruskal();
        // AAM
        Double[][] matrizAdyacenciasKruskal2 = UtilGrafos.obtenerMatrizCostos(kruskal2.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matrizAdyacenciasKruskal2, prim2.getVertices(), "AAM Kruskal");
    }
}
