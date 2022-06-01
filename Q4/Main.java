package day10.Q4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Area area=new Area();
        int areaOfCircle= area.circleArea(2);
        int  areaOfRectangle=area.rectangleArea(2,2);	
        int areaOfSquare=area.squareArea(2);
       
        System.out.println(areaOfRectangle);
        System.out.println(areaOfSquare);
        System.out.println(areaOfCircle);
	}

}
