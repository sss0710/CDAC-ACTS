/*
Write a menu driven billing system for a Snacks center, items available are Tea(Rs. 10), Samosa (Rs. 20), Sandwitch(Rs. 50), Green Tea (Rs. 15) etc. as follows -

**Welcome to Snack Center**
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 1
   Enter quantity : 2
   
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 3
  Enter quantity : 3
  
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 5

 *****BILL****
 Tea    2    20
 Samosa 3    60
 ------------
 Total = 80
*/
import java.util.Scanner;

public class Assign_Sec6_Que03 {
	public static void main(String[] args) {
		SnacksCenter newOrder = new SnacksCenter();
		do {
		SnacksCenter.takeOrder();
		newOrder.orderInput();
		newOrder.addQty();
		}while(newOrder.choice!=5);
		SnacksCenter.generateBill();
	}
}

class SnacksCenter{
	int choice;
	int qty;
	static int teaqty;
	static int greentqty;
	static int samosaqty;
	static int sandwhich;
	

	Scanner sc = new Scanner(System.in);
	static void takeOrder() {
		System.out.println("**Welcome to Snack Center**");
		System.out.println("1. Tea (Rs. 10)");
		System.out.println("2. Green Tea (Rs. 15)");
		System.out.println("3. Samosa (Rs. 20)");
		System.out.println("4. Sandwitch (Rs. 50)");
		System.out.println("5. Generate Bill & Exit");
	}
	
	void orderInput() {
		System.out.print("Enter your choice : ");
		choice=sc.nextInt();
		if(choice!=5) {
		System.out.print("Enter quantity : ");
		qty=sc.nextInt();
		}
		else 
			return;
	}
	
	void addQty() {
		switch(choice) {
		case 1: teaqty=teaqty+qty; break;
		case 2: greentqty=greentqty+qty; break;
		case 3:	samosaqty=samosaqty+qty; break;
		case 4: sandwhich=sandwhich+qty; break;
		default : break;
		}
	}
	
	static void generateBill() {
		System.out.println(" *****BILL****");
		if (teaqty!=0)
			System.out.println(" Tea       "+teaqty+"    "+(10*teaqty));
		if (greentqty!=0)
			System.out.println(" Green Tea "+greentqty+"    "+(15*greentqty));
		if (samosaqty!=0)
			System.out.println(" Samosa    "+samosaqty+"    "+(20*samosaqty));
		if (sandwhich!=0)
			System.out.println(" Sandwitch "+sandwhich+"    "+(50*sandwhich));
		System.out.println(" -----------------");
		System.out.println(" Total =        "+(10*teaqty+15*greentqty+20*samosaqty+50*sandwhich));
	}
}

