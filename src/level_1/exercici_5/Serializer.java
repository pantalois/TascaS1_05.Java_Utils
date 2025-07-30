package level_1.exercici_5;

import java.io.*;


public class Serializer{

    public static void serializeObject(ObjectToSerialize objectToSerialize, String path){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {

            outputStream.writeObject(objectToSerialize);
            System.out.println("Object serialized successfully");

        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    public static void deserializeObject(String path) {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(path))) {


            ObjectToSerialize obj = (ObjectToSerialize) inputStream.readObject();

            if (obj != null) {
                System.out.println("Object deserialized successfully");
                System.out.println("Name: " + obj.getName());
                System.out.println("Id: " + obj.getId());

            } else {
                System.out.println("Deserialization returned null object");
            }
        } catch (IOException e) {
            System.err.println("Deserialization I/O error: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found during deserialization: " + e.getMessage());
        }
    }
}
