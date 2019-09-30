package java-SnackBar;

public class Main
{
	public static void main(String[] args)
	{
		// Instantiate Customer, VendingMachine, Snack
		Customer c1 = new Customer("Jane", 45.25, c1.id);
		Customer c2 = new Customer("Bob", 33.14, c2.id);

		VendingMachine vm1 = new VendingMachine("Food", vm1.getId());
		VendingMachine vm2 = new VendingMachine("Drink", vm2.getId());
		VendingMachine vm3 = new VendingMachine("Office", vm3.getId());

		Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId(), s1.id);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId(), s2.id);
		Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId(), s3.id);
		Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId(), s4.id);
		Snack s5 = new Snack("Water", 20, 2.75, vm2.getId(), s5.id);	
	}
}