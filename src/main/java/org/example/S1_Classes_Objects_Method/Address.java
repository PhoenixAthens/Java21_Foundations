package org.example.S1_Classes_Objects_Method;

public class Address {
    private String HouseNumber;
    private String StreetNumber;
    private String PostalCode;
    private String Area;
    private String city;
    private String State;
    private String Country;

    public Address(String houseNumber, String streetNumber, String postalCode, String area, String city, String state, String country) {
        HouseNumber = houseNumber;
        StreetNumber = streetNumber;
        PostalCode = postalCode;
        Area = area;
        this.city = city;
        State = state;
        Country = country;
    }

    public String getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "HouseNumber='" + HouseNumber + '\'' +
                ", StreetNumber='" + StreetNumber + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Area='" + Area + '\'' +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
