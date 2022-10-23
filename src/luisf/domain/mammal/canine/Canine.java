package luisf.domain.mammal.canine;

import luisf.domain.mammal.Mammal;

abstract public class Canine extends Mammal {
    private String color;
    private Float fangSize;

    public Canine(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize) {
        super(habitat, height, length, weight, scientificName);
        this.color = color;
        this.fangSize = fangSize;
    }

    public String getColor() {
        return color;
    }

    public Float getFangSize() {
        return fangSize;
    }
}
