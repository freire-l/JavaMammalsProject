package luisf.domain.mammal;

abstract public class Mammal {
    protected String habitat;
    protected Float height;
    protected Float length;
    protected Float weight;
    protected String scientificName;

    public Mammal(String habitat, Float height, Float length, Float weight, String scientificName) {
        this.habitat = habitat;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.scientificName = scientificName;
    }

    //getters

    public String getHabitat() {
        return habitat;
    }

    public Float getHeight() {
        return height;
    }

    public Float getLength() {
        return length;
    }

    public Float getWeight() {
        return weight;
    }

    public String getScientificName() {
        return scientificName;
    }

    //

    abstract public String eat();
    abstract public String sleep();
    abstract public String run();
    abstract public String communicate();


}
