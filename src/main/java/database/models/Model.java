package database.models;

import java.util.Random;

public abstract class Model implements ModelInterface{
    public int generateId(){
        Random r = new Random();
        return r.nextInt();
    }
}
