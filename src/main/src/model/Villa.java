package model;

public class Villa {
    private int id ;
    private int idSpecies;
    private String address;
    private int rooms;
    private double acreage;
    private int gara;
    private String description;

    public Villa(){}

    public Villa(int id, int idSpecies, String address, int rooms, double acreage, int gara, String description) {
        this.id = id;
        this.idSpecies = idSpecies;
        this.address = address;
        this.rooms = rooms;
        this.acreage = acreage;
        this.gara = gara;
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

    public int getGara() {
        return gara;
    }

    public void setGara(int gara) {
        this.gara = gara;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}