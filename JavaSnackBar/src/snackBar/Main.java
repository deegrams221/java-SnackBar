package snackBar;

public class Main
{
	public static void main(String[] args)
	{
		// Instantiate Customer, VendingMachine, Snack
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine vm1 = new VendingMachine("Food");
		VendingMachine vm2 = new VendingMachine("Drink");
		VendingMachine vm3 = new VendingMachine("Office");

		Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
		
		Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
		Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());	

		// Processing
		System.out.println("*** Query Data ***");
		System.out.println("\n");

		//Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		System.out.println(c1.getName() + "'s current cash is $" + c1.getCash());
		System.out.println("There are " + s4.getQuantity() + s4.getName() + "s.");
		
		c1.buySnack(s4.getCost() * 3);
		s4.setQuantity(s4.getQuantity() - 3);

		System.out.println(c1.getName() + "'s cash on hand left over is $" + c1.getCash());
		System.out.println("There are " + s4.getQuantity() + s4.getName() + "s left.");
		System.out.println("\n");

		//Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
		System.out.println(c1.getName() + "'s current cash is $" + c1.getCash());
		System.out.println("There are " + s3.getQuantity() + s3.getName() + "s.");

		c1.buySnack(s3.getCost());
		s3.setQuantity(s3.getQuantity() -1);

		System.out.println(c1.getName() + " bought 1 " + s3.getName() + " and now she has $" + c1.getCash());
		System.out.println("There are " + s3.getQuantity() + s3.getName() + "s left.");
		System.out.println("\n");
		
		//Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
		System.out.println(c2.getName() + "'s current cash is $" + c2.getCash());
		System.out.println("There are " + s4.getQuantity() + s4.getName() + "s.");

		c2.buySnack(s4.getCost() * 2);
		s4.setQuantity(s4.getQuantity() -2);

		System.out.println(c2.getName() + " bought 2 " + s4.getName() + " and now has $" + c2.getCash());
		System.out.println("There are " + s4.getQuantity() + s4.getName() + "s left.");
		System.out.println("\n");

		//Customer 1 finds $10. Print Customer 1 Cash on Hand.
		System.out.println(c1.getName() + " has $" + c1.getCash());

		c1.addCash(10);

		System.out.println(c1.getName() + " found $10 and now has $" + c1.getCash());
		System.out.println("\n");

		//Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
		System.out.println(c1.getName() + "'s current cash is $" + c1.getCash());
		System.out.println("There are " + s2.getQuantity() + s2.getName() + "s.");

		c1.buySnack(s2.getCost());
		s2.setQuantity(s2.getQuantity() -1);

		System.out.println(c1.getName() + " bought 1" + s2.getName() + " and now has $" + c1.getCash());
		System.out.println("There are " + s2.getQuantity() + s2.getName() + "s left.");
		System.out.println("\n");

		//Add 12 more items to snack 3. Print quantity of snack 3.
		System.out.println("There are " + s3.getQuantity() + " " + s3.getName() + "s.");

		s3.addQuantity(12);
		//s3.setQuantity(s3.getQuantity() + 12);

		System.out.println("Now there are " + s3.getQuantity() + " " + s3.getName() + "s.");
		System.out.println("\n");

		//Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
		System.out.println(c2.getName() + " has $" + c2.getCash());
		System.out.println("There are " + s3.getQuantity() + s3.getName() + "s.");

		c2.buySnack(s3.getCost() * 3);
		s3.setQuantity(s3.getQuantity() - 3);

		System.out.println(c2.getName() + " bought 3 " + s3.getName() +"s and now has $" + c2.getCash());
		System.out.println("Now there are " + s3.getQuantity() + " " + s3.getName() + ".");

	}
}