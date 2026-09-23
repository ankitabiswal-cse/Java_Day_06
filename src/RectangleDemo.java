class Rectangle{
    int length;
    int breadth;

    void area(){
        int area = length*breadth;
        System.out.println("Area Of The Reactangle Is ="+area);
    }
}
public class RectangleDemo{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();

        r1.length = 76;
        r1.breadth = 50;

        r1.area();
    }
}