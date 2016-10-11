
package bicicleta;

public class Bicicleta {

    public static void main(String[] args) {
        Circulos LLanta1=
                new Circulos(12, "negro");
        Circulos Llanta2=
                new Circulos(12, "negro");
        Circulos Plato=
                new Circulos(2, "gris");
        Triangulos Triang1=
                new Triangulos(8, "azul");
        Triangulos Triang2=
                new Triangulos(8, "plateado");
        Triangulos Triang3=
                new Triangulos(8, "blanco");
        
        Biciclet b = new Biciclet();
        b.AgregarFigurasGeometricas(Plato);
        b.AgregarFigurasGeometricas(LLanta1);
        b.AgregarFigurasGeometricas(Llanta2);
        b.AgregarFigurasGeometricas(Triang1);
        b.AgregarFigurasGeometricas(Triang2);
        b.AgregarFigurasGeometricas(Triang3);
        double area=b.CalcularAreaTotal();
        System.out.println(area);
        System.out.println(b);
    }
    
}
