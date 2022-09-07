public class strings {
    public static void main(String[] args) {
        exercise();
    }

    private static void exercise() {
        String name = "Ayan Das";
        String address = "Aerial bay, Diglipur";
        System.out.println(name);
        System.out.println(address);
        name.concat(" is a good person");
        System.out.println(name);
        StringBuilder anothername = new StringBuilder("Ayan Das");
        anothername.append(" is a good person");
        System.out.println(anothername);
 
    }
}
