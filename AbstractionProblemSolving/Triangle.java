package AbstractionProblemSolving;

class Triangle  extends  Shape{
    Triangle(double l, double h){
        super(l,h);
    }
    public void area(){
        double area=x1*x2;
        System.out.println("Area of Triangle "+area);
    }
}
