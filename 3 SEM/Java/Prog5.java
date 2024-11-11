class Shapes{
    void draw()
    {
        System.out.println("Drawing Shapes");
    }
    void erase()
    {
        System.out.println("Erasing Shapes");
    }
}

class Circle extends Shapes{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    void erase()
    {
        System.out.println("Erasing Circle");
    }

}

class Triangle extends Shapes{
    void draw()
    {
        System.out.println("Drawing Triangle");
    }
    void erase()
    {
        System.out.println("Erasing Triangle");
    }

}

class Square extends Shapes{
    void draw()
    {
        System.out.println("Drawing Square");
    }
    void erase()
    {
        System.out.println("Erasing Square");
    }

}

public class Prog5 {
    public static void main(String[] args) {
        Shapes s=new Square();
        Shapes c=new Circle();
        Shapes t=new Triangle();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();

    }
    
}
