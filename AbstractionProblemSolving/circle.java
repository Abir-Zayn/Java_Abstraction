package AbstractionProblemSolving;

public class circle extends  Shape{
    circle(double r){
        super(r,r);
    }
    public  void  area(){
        double area= Math.PI* x1*x2;
        String res=String.format("%.4f" ,area);
        System.out.println("Area of Circle "+res);
    }
}
