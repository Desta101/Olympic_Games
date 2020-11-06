package Model;
//Shimon Desta-203670286

public abstract class Athlete extends Person {
    private String countryName;
    private int numOfMedals;

    public Athlete(String name, int age, String gender) {
        super(name, age, gender);
        this.numOfMedals = 0;
    }

    public Athlete(String name, int age, String gender, Country country) {
        super(name, age, gender);
        this.numOfMedals = numOfMedals;
        countryName = country.getCountryName();
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumOfMedals() {

        return numOfMedals;
    }



    public void addNumOfMedals() {
        this.numOfMedals++;
    }

    @Override
    public String toString() {
        return super.toString()  + "num Of medals: " + numOfMedals ;
    }
}
