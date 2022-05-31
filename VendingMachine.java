package BSIT1A3GDTVendingMachine;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("WELCOME TO 3GDT VENDING MACHINE!!");
		
		
		System.out.println("What is your order Ma'am/Sir?");
		
		
		System.out.println("•BEVERAGES & SNACKS ITEMS AVAILABLE•");
		
		
		String beverages[]= {"Coca-cola", "Sprite", "Royal", "Mogu-mogu", "Smart-C", "Vita Milk", "Rootbeer Soda", "Le Minerale",  "Absolute (Water)", "Magic Chips Big Packs (Cheese, Barbeque)", "Piattos (Cheese, Sour, n' Cream, Barbeque)", "Pier Crackers", "Gardenia Muffin", "Almond Chocoball", "Snickers", "Nova (Cheese, Barbeque)"};
			double price[]= {30, 30, 30, 40, 30, 25, 35, 15, 20, 55, 70, 25, 30, 65, 45, 75};
		
		
		
		System.out.println(beverages[0] + "\t " + "₱"+price[0]);
		System.out.println(beverages[1] + "\t " + "₱"+price[1]);
		System.out.println(beverages[2] + "\t " + "₱"+price[2]);
		System.out.println(beverages[3] + "\t " + "₱"+price[3]);
		System.out.println(beverages[4] + "\t " + "₱"+price[4]);
		System.out.println(beverages[5] + "\t " + "₱"+price[5]);
		System.out.println(beverages[6] + "\t " + "₱"+price[6]);
		System.out.println(beverages[7] + "\t " + "₱"+price[7]);
		System.out.println(beverages[8] + "\t " + "₱"+price[8]);
		System.out.println(beverages[9] + "\t " + "₱"+price[9]);
		System.out.println(beverages[10] + "\t " + "₱"+price[10]);
		System.out.println(beverages[11] + "\t " + "₱"+price[11]);
		System.out.println(beverages[12] + "\t " + "₱"+price[12]);
		System.out.println(beverages[13] + "\t " + "₱"+price[13]);
		System.out.println(beverages[14] + "\t " + "₱"+price[14]);
		System.out.println(beverages[15] + "\t " + "₱"+price[15]);
		

		System.out.println();
		System.out.print("Enter here, the name of the items you want to buy ma'am/Sir! ::\t");
		String name= x.nextLine();
		System.out.print("Enter quantity ::\t");
		int quantity= x.nextInt();
		System.out.print("Pay here maam/sir :: ₱\t");
		double money= x.nextDouble();
			
	if(quantity >= 0 && quantity <= 50){
		if(name.equalsIgnoreCase("Coca-cola")){
			double b= (double) quantity;
			double c= b * price[0];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Sprite")){
			double b= (double) quantity;
			double c= b * price[1];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Royal")){
			double b= (double) quantity;
			double c= b * price[2];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Mogu-mogu")){
			double b= (double) quantity;
			double c= b * price[3];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Smart-C")){
			double b= (double) quantity;
			double c= b * price[4];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Vita Milk")){
			double b= (double) quantity;
			double c= b * price[5];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Rootbeer Soda")){
			double b= (double) quantity;
			double c= b * price[6];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Le Minerale")){
			double b= (double) quantity;
			double c= b * price[7];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Absolute (Water)")){
			double b= (double) quantity;
			double c= b * price[8];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------"); 
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Magic Chips Big Packs (Cheese, Barbeque)")){
			double b= (double) quantity;
			double c= b * price[9];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------"); 
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Piattos (Cheese, Sour, n' Cream, Barbeque)")){
			double b= (double) quantity;
			double c= b * price[10];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------"); 
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Pier Crackers")){
			double b= (double) quantity;
			double c= b * price[11];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------"); 
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Gardenia Muffin")){
			double b= (double) quantity;
			double c= b * price[12];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Almond Chocoball")){
			double b= (double) quantity;
			double c= b * price[13];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
	}else if(name.equalsIgnoreCase("Snickers")){
			double b= (double) quantity;
			double c= b * price[14];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);;
		}else if(name.equalsIgnoreCase("Nova (Cheese, Barbeque")){
			double b= (double) quantity;
			double c= b * price[0];
			double d= money - c;
			System.out.println();
			System.out.println("-----------------------------");    
			System.out.println("Total ::\t " + "₱\t" +c);
			System.out.println("Change ::\t " + "₱\t" +d);
	}else System.out.println("try again");
	}
	}
  }