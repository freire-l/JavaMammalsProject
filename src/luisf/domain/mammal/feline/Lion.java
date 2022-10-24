package luisf.domain.mammal.feline;

abstract public class Lion extends Feline{
    private Integer herdNum;
    private Float roarDecibels;

    public Lion(String habitat, Float height, Float length, Float weight, String scientificName, Float clawSize, Integer speed, Integer herdNum, Float roarDecibels) {
        super(habitat, height, length, weight, scientificName, clawSize, speed);
        this.herdNum = herdNum;
        this.roarDecibels = roarDecibels;
    }

    public Integer getHerdNum() {
        return herdNum;
    }

    public Float getRoarDecibels() {
        return roarDecibels;
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
