
package bicicleta;


public class Biciclet {
   private Figuras[] fgs;
   private int numFg;

    public Biciclet() {
        this.fgs = new Figuras[6];
        this.numFg=0;
    }
   
   public boolean AgregarFigurasGeometricas(Figuras f){
       if(this.numFg<6){
       this.fgs[this.numFg]=f;
       this.numFg++;
       return true;
       }
       return false;
   }
   public double CalcularAreaTotal(){
   double area=0;
   for(Figuras fg: fgs)
       area += fg.CalcularArea();
   return area;
   }

    @Override
    public String toString() {
        return "Biciclet{" + "fgs=" + fgs + ", numFg=" + numFg + '}';
    }
   
}
