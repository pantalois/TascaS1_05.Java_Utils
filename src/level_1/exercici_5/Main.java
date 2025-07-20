package level_1.exercici_5;


public class Main {
    public static void main(String[] args) {
        String serilizedPath = "object.ser";

        ObjectToSerialize objectToSerialize = new ObjectToSerialize("Object1", 1);
        Serializer.serializeObject(objectToSerialize, serilizedPath);
        Serializer.deserializeObject(serilizedPath);
    }
}