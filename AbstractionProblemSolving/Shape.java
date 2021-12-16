package AbstractionProblemSolving;

abstract class Shape {

    public double x1;
    public double x2;

    Shape(double x1, double x2) {
        this.x1=x1;
        this.x2 = x2;
    }
   abstract void area() ;
}
