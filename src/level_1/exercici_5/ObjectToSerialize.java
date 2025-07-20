package level_1.exercici_5;

import java.io.Serializable;

public class ObjectToSerialize implements Serializable {
    private String name;
    private int id;

    public ObjectToSerialize(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "ObjectToSerialize [name=" + name + ", id=" + id + "]";
    }
}
