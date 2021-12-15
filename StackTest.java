package AbstractedJavaStack;

abstract class stack{
    int top=-1;
    abstract void pop();
    abstract void push(int x);
}

class test extends stack {
    int[] stack = new int[10];

    public void push(int x){
        if(top==9){
            System.out.println("Overflow");
            System.exit(1);
        }
        System.out.println("Inserting "+x);
        stack[++top]=x;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Underflow.");
            System.exit(1);
        }
        --top;
    }

    public void display(){
        for(int x:stack){
            System.out.print(" "+x+" ");
        }
    }
}

public class StackTest {
    public static void main(String[] args) {
        test t=new test();
        t.push(7);
        t.push(11);
        t.push(10);
        t.push(70);
        t.push(81);
        t.push(37);
        t.push(27);


        t.pop();
        t.pop();
        t.pop();
        t.pop();

        t.display();
    }


}
