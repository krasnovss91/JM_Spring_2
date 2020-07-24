package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal {


    @Autowired
    private Dog dog;

    @Override

    public String toString() {
        return dog.toString();
    }

}
