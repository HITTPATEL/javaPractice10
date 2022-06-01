package day10.Q1;


import java.util.Scanner;

import javax.lang.model.element.Element;

public class Demo {

	
	public Hotel provideFood(int amount) {
	if(amount>1000) {
		TajHotel tajHotel=new TajHotel();
				return tajHotel;
	}
	else if(amount>200  && amount<1000) {
		 RoadSideHotel roadSideHotel=new RoadSideHotel();
		 return roadSideHotel;
	}
		return null;
	}
	
	
	public static void main(String[] args) {
		  Scanner inputScanner=new Scanner(System.in);
		  System.out.println("Enter amount");
		  int amount=inputScanner.nextInt();
		  
		  Demo d1=new Demo();
		  Hotel h1=d1.provideFood(amount);
		  
		  if(h1 instanceof TajHotel) {
			 TajHotel tajHotel=(TajHotel) h1;
			 tajHotel.welcomeDrink();
			 tajHotel.chickenBiryani();
			 tajHotel.masalaDosa();
		  }
		  else if(h1 instanceof RoadSideHotel) {
			  RoadSideHotel roadSideHotel=(RoadSideHotel) h1;
			  roadSideHotel.chickenBiryani();
			  roadSideHotel.masalaDosa();
		  }
		  else {
			  System.out.println("Please Enter a valid amount");
		  }
	}
}
