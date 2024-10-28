public class Circle {
    private final double raio;
    private final String cor;

    public Circle(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }

    public double getArea(){
        return Math.PI * Math.pow(raio,2);
    }

    public double getCircunference(){
        return 2 * Math.PI * raio;
    }

    public double getRaio(){
        return raio;
    }

    public String getCor(){
        return cor;
    }

}
