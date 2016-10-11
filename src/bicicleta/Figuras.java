
package bicicleta;


public class Figuras {
    protected  String color;

    public Figuras(String color) {
        this.color = color;
    }
    
    public double CalcularArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Figuras{" + "color=" + color + '}';
    }
    
}
