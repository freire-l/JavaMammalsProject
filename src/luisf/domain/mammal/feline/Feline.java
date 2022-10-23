package luisf.domain.mammal.feline;

import luisf.domain.mammal.Mammal;

abstract public class Feline extends Mammal {
    protected Float clawSize;
    protected Integer speed;

    public Feline(String habitat, Float height, Float length, Float weight, String scientificName, Float clawSize, Integer speed) {
        super(habitat, height, length, weight, scientificName);
        this.clawSize = clawSize;
        this.speed = speed;
    }

    public Float getClawSize() {
        return clawSize;
    }

    public Integer getSpeed() {
        return speed;
    }
}
