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

		//Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		c1.buySnack(s4.getTotal(3));
		
		System.out.println("Jane's cash on hand: $" + (c1.getCash());
		System.out.println("There are " + () + "sodas left");

		//Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

		//Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.

		//Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

		//Customer 1 finds $10. Print Customer 1 Cash on Hand.

		//Add 12 more items to snack 3. Print quantity of snack 3.

		//Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.

	}
}