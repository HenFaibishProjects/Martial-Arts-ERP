package Items;

public abstract class Abstractsaleitem {
	String name;
	String barode;
	int purchesPrice;

	public Abstractsaleitem(String name, String barode, int purchesPrice) {
		this.name = name;
		this.barode = barode;
		this.purchesPrice = purchesPrice;
	}

	public Abstractsaleitem(String barode) {
		this.barode = barode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBarode() {
		return barode;
	}

	public void setBarode(String barode) {
		this.barode = barode;
	}

	public int getPurchesPrice() {
		return purchesPrice;
	}

	public void setPurchesPrice(int purchesPrice) {
		this.purchesPrice = purchesPrice;
	}

}
