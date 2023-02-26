public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins){
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    private void moveMuscles(){
        System.out.println("Muscles Moving");
    }
    private void moveBackFin(){
        System.out.println("Backfin Moving");
    }

    @Override
    public void move (String speed){
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "{" +
            " gills='" + gills + "'" +
            ", fins='" + fins + "'" +
            "} " + super.toString();
    }

}
