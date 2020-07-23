package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class Timer
{
    @Autowired
    private AnimalsCage animalsCage;

    public String toString(){
        return animalsCage.whatAnimalSay();
    }

    private Long nanoTime = System.nanoTime();



    public Long getTime() {
        return nanoTime;
    }
}
