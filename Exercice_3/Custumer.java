public class Custumer {

    private int ID;
    private String name;
    private char gender;
    
    public Custumer(int ID, String name, char gender) {
        super();
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    
    public int getID() {
        return this.ID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public char getGender() {
        return this.gender;
    }
    
    @Override
    public String toString() {
        return this.name+"("+this.ID+")";
    }
    
}
