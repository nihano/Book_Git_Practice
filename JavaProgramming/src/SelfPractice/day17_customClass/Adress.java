package SelfPractice.day17_customClass;

public class Adress {

    public String buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString(){
        return buildingNumber + " " + street +"\n" + city + " "+ state+", " + zipCode;
    }
}

/*
 Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */