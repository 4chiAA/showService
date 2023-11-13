package bootcamp.neuefische;

public record Order(String name, String type) {

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }
}
