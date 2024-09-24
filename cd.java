package CDCVDPRO;

public class cd extends product {
    private String artist;
    private int jumlah_lagu;
    private String label;

	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getJumlah_lagu() {
		return this.jumlah_lagu;
	}

	public void setJumlah_lagu(int jumlah_lagu) {
		this.jumlah_lagu = jumlah_lagu;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


    public cd(){
        //mengakses dri drive product
        super(); //mengakses konstraktor superclass
        artist = "";
        jumlah_lagu = 0;
        label = "";

    }
    public cd(int number, String name, int quantity, double price, String artist, int jumlah_lagu, String label) {
        super(number, name, quantity, price);
        this.artist = artist;
        this.jumlah_lagu = jumlah_lagu;
        this.label = label;

    }

	public void print() {
		super.print();
		System.out.println("Artist :  " + artist);
		System.out.println("Jumlah Lagu :" + jumlah_lagu);
		System.out.println("Label : " + label);
	}
}
