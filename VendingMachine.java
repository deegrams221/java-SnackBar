package java-SnackBar;

public class VendingMachine
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;

	// constructor
	// initial state of the object
	public VendingMachine(String name)
	{
		maxId++;

		id = maxId;

		this.name = name;
	}

	// methods
	public int getId()
	{
		return id;
	}

	public void setName(Sting name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	// Object
	@Override
	public String toString()
	{
		String rtnString = "id: " + id + "\n" +
							"name: " + name + "\n";
		return rtnString;
	}
}