package AbstractionProblemSolving;

class Rectangle extends  Shape {
    Rectangle(double l, double h){
        super(l,h);
    }
    public void area(){
        double area=0.5*x1*x2;
        System.out.println("Area of Rectangle "+area);
    }
}
