package Lambda;
//Here only one abstract method and others methods are default so we can easily convert this code into lambda expression.Here under Shape class only an abstract methods

interface Shape{
    void Draw();
}
class Rectangle implements Shape{
 public    void Draw(){
     System.out.println("Rectangle");

    }
}
class Square implements Shape{
    @Override
    public void Draw() {
        System.out.println("Square");
    }
}
class Circle implements Shape{
    @Override
    public void Draw() {
        System.out.println("Circle");
    }
}

public class LambdaExample {
}
