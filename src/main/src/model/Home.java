package model;

public class Home {
    private int id;
    private int idSpecies;

    public Home(){}

    public Home(int id, int idSpecies) {
        this.id = id;
        this.idSpecies = idSpecies;
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

}

