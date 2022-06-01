package day10.Q4;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int area=2*(length+breadth);
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area=side*side;
		return area;
	}

	@Override
	public int circleArea(int radius) {
		int area=22/7*radius*radius
		return area;
	}

	

}
