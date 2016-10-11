
package bicicleta;


public class Circulos extends Figuras {
    private double radio;

    public Circulos(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea(){
    double area = radio*radio*Math.PI;
    return area;
    }

    @Override
    public String toString() {
        return "Circulos{" + "radio=" + radio + '}';
    }
    
}
