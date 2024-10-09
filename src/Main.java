import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);
        boolean whileWindowShouldClose = true;

        System.out.println("This is your Tamagotchi: ");
        tamagotchi.name = "Betty";

        tamagotchi.teach("Hello");

        while (whileWindowShouldClose) {
            System.out.println("What will you be doing: ");
            System.out.println("A: Teach a word \n B: Feed the thing \n C: Say something \n D: Pass time");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("A")) {
                System.out.print("Input the word to teach: ");
                tamagotchi.teach(scanner.nextLine());
                System.out.print("Success!");
            } else if (answer.equalsIgnoreCase("B")) {
                tamagotchi.feed();
            } else if (answer.equalsIgnoreCase("C")) {
                tamagotchi.speak();
            } else if (answer.equalsIgnoreCase("D")) {
                tamagotchi.tick();
                tamagotchi.printStats();
            }

            if (!tamagotchi.getAlive()) {
                whileWindowShouldClose = false;
            }
        }
    }
}