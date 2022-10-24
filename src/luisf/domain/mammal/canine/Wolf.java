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
        return "The wolf is eating using this bite of " + this.biteStrength + "pound of strength";
    }

    @Override
    public String sleep() {
        return "The " + this.getColor() + " wolf is sleeping in the " + this.getHabitat();
    }

    @Override
    public String run() {
        return "The wolf runs";
    }

    @Override
    public String communicate() {
        return "The wolf is barking, his true name its " + this.getScientificName();
    }

    public Wolf(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize) {
        super(habitat, height, length, weight, scientificName, color, fangSize);
    }
}
