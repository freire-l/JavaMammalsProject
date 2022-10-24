package luisf.domain.mammal;

import luisf.domain.mammal.canine.Dog;
import luisf.domain.mammal.canine.Wolf;
import luisf.domain.mammal.feline.Lion;
import luisf.domain.mammal.feline.Tiger;

public class MammalsProject {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[6];

        mammals[0] = new Lion("Jungle",5.0f,7.5f,58f,"Lionus maximus", 6.1f,120,1,45.6f);
        mammals[1] = new Lion("Jungle",6.0f,9.5f,67f,"Lionus maximus", 4.1f,100,1,60.6f);
        mammals[2] = new Wolf("Fields", 4.5f, 8.9f, 54f, "wolfie", "green", 45f, 60);
        mammals[3] = new Dog("Fields", 4.5f, 8.9f, 54f, "doggie", "green", 45f, 2);
        mammals[4] = new Tiger("Jungle",6.0f,9.5f,67f,"Lionus maximus", 4.1f,100, "White tiger");

        for (Mammal animal : mammals){
            if(animal != null) {
                System.out.println(animal.eat());
                System.out.println(animal.sleep());
                System.out.println(animal.run());
                System.out.println(animal.communicate());
            }
        }

    }
}
