package tutorial;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDREN = 2;
	private String _title;
	private Price _price;

	public Movie(String title, int priceCode) {
		this._title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDREN:
			_price = new RegularPrice();
			break;
		case NEW_RELEASE:
			_price = new RegularPrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
		}
	}

	double getCharge(int daysRented) {
		double thisAmount = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			thisAmount += 2;
			if (daysRented > 2)
				thisAmount += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += daysRented * 3;
			break;
		case Movie.CHILDREN:
			thisAmount += 1.5;
			if (daysRented > 3)
				thisAmount += (daysRented - 3) * 1.5;
			break;
		}
		return thisAmount;
	}

}
