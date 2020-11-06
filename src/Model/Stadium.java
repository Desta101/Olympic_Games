package Model;
//Shimon Desta-203670286

public class Stadium {
	private String stadiumName;
	private String City;
	private int Seats;

	public Stadium(String stadiumName, String City, int Seats) {
		setStadiumName(stadiumName);
		this.City = City;
		setSeats(Seats);
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getCity() {
		return City;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int Seats) {
		this.Seats = Seats;
	}

	@Override
	public String toString() {
		return  stadiumName  + ", City: " + City  + ", Seats: " + Seats +'\n';
	}
}