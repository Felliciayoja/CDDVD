package CDCVDPRO;

public class dvd extends product {
    private double durasi;
    private String rating;
    private String studio;

	public double getDurasi() {
		return this.durasi;
	}

	public void setDurasi(double durasi) {
		this.durasi = durasi;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public dvd(){
        //mengakses dri drive product
        super(); //mengakses konstraktor superclass
        number = 0;
        name  = "";
        quantity = 0;
		price = 0;
		durasi = 0;
		rating = "";
		studio = "";
	}

    public dvd(int number, String name, int quantity, double price, double durasi, String rating, String studio) {
        super(number, name, quantity, price);
        this.durasi = durasi;
        this.rating = rating;
        this.studio = studio;

    }
	public void print () {
		super.print();
		System.out.println("Nama :" + name);
		System.out.println("Durasi : "+durasi);
		System.out.println("Rating : "+ rating);
		System.out.println("Studio :"+ studio);
	}
}
