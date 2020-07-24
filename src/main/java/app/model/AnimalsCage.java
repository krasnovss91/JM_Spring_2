package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
   private Animal animal;
    private Timer timer = new Timer();
    public  void  setAnimal(Animal animal){
        this.animal = animal;
    }

    public String whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
       // System.out.println(new Timer().getTime());
        System.out.println("________________________");
        return null;
    }
}
