package luisf.domain.mammal.feline;

public class Tiger extends Feline{
    private String tigerSpecies;

    public Tiger(String habitat, Float height, Float length, Float weight, String scientificName, Float clawSize, Integer speed) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
    }


    public String getTigerSpecies() {
        return tigerSpecies;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String sleep() {
        return null;
    }

    @Override
    public String run() {
        return "The Tiger is running at " + this.getSpeed() + "Km/h";
    }

    @Override
    public String communicate() {
        return null;
    }


}
