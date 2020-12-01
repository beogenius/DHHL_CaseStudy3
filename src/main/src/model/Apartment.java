package model;

public class Apartment {
    private int id;
    private int idSpecies;
    private String address;
    private int rooms;
    private double acreage;
    private int floors;
    private String description;

    public Apartment(){}

    public Apartment(int id, int idSpecies, String address, int rooms, double acreage, int floors, String description) {
        this.id = id;
        this.idSpecies = idSpecies;
        this.address = address;
        this.rooms = rooms;
        this.acreage = acreage;
        this.floors = floors;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSpecies() {
        return idSpecies;
    }

    public void setIdSpecies(int idSpecies) {
        this.idSpecies = idSpecies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
