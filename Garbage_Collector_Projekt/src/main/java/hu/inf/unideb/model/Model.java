package hu.inf.unideb.model;

public class Model {

    private Notebook notebook;

    public Model() {
        //this.notebook = new Notebook(1, "ASUS", "K51AC-SX001D", 15.6, 2048, 250, "ATi Mobility Radeon HD3200 256MB", 101200, 1, 8, 0);
        this.notebook = new Notebook(null, "HP","COMPAQ 615 NX556EA",15.6, 1024, 160, "ATi Mobility Radeon HD3200 256MB",95120, 1, 1, 1);
    }

    public Notebook getNotebook(){
        return notebook;
    }

    public void setNotebook(Notebook notebook){
        this.notebook = notebook;
    }
}
