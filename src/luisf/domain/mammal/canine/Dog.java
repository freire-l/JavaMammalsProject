package luisf.domain.mammal.canine;

abstract public class Dog extends Canine{
    private Integer packNum;

    public Dog(String habitat, Float height, Float length, Float weight, String scientificName, String color, Float fangSize, Integer packNum, Float fangSize1) {
        super(habitat, height, length, weight, scientificName, color, fangSize);
        this.packNum = packNum;
        this.fangSize = fangSize1;
    }

    public Integer getPackNum() {
        return packNum;
    }

    @Override
    public String eat() {
        return "The " + this.getScientificName() + " is eating";
    }

    @Override
    public String sleep() {
        return "The " + this.getColor() + " dog is sleeping next to his pack " + this.getPackNum();
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
