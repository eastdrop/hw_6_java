public class User {
    String name;

    User(String Name){
        name = Name;
    }

    public String toString() {

        return String.format("%s", name);
    }

}
