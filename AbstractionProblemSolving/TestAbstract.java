package AbstractionProblemSolving;

public class TestAbstract {
    public static void main(String[] args) {
        Triangle t=new Triangle(10,12);
        t.area();

        Rectangle r=new Rectangle(5,6);
        r.area();

        circle c=new circle(4);
        c.area();
    }
}
