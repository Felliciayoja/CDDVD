package CDCVDPRO;

public class product {
    protected int number;
    protected String name;
    protected int quantity;
    protected double price;


	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    //constractor product
    public product(){
        number = 0;
        name = "";
        quantity = 0;
        price = 0.0;
    }
public product(int number, String name, int quantity, double price) {
    this.number = number;
    this.name = name;
    this.quantity = quantity;
    this.price = price;

    }
public void print() {
	System.out.println("Number : " + number );
	System.out.println("Nama : "+ name);
	System.out.println("Quantity : " + quantity);
	System.out.println("Price : " + price);
}
    
}