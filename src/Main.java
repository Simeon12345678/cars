public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        System.out.println("This is your tamagotchi: ");
        tamagotchi.name = "Betty";

        tamagotchi.teach("Hello");

        tamagotchi.printStats();
    }
}