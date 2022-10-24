package luisf.domain.mammal.canine;

public class Wolf extends Canine{
    private Integer biteStrength;

    public Wolf(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize, Integer biteStrength) {
        super(habitat, height, length, weight, scientificName, color, fangSize);
        this.biteStrength = biteStrength;
    }

    public Integer getBiteStrength() {
        return biteStrength;
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
        return null;
    }

    @Override
    public String communicate() {
        return null;
    }

    public Wolf(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize) {
        super(habitat, height, length, weight, scientificName, color, fangSize);
    }
}
