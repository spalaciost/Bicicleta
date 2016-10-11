
package bicicleta;

        
public class Triangulos extends Figuras{
    public double lado;

    public Triangulos(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double CalcularArea(){
    double area = (lado*lado*Math.sqrt(3))/4;
    return area;
    }

    @Override
    public String toString() {
        return "Triangulos{" + "lado=" + lado + '}';
    }
    
}
