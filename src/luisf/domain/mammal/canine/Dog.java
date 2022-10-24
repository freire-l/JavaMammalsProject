package luisf.domain.mammal.canine;

abstract public class Dog extends Canine{
    private Integer packNum;
    private Float fangSize;

    public Dog(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize, Integer packNum, Float fangSize1) {
        super(habitat, height, length, weight, scientificName, color, fangSize);
        this.packNum = packNum;
        this.fangSize = fangSize1;
    }

    public Integer getPackNum() {
        return packNum;
    }

    @Override
    public Float getFangSize() {
        return fangSize;
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

}
