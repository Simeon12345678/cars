import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<String>() ;
    private boolean isAlive = true;
    private Random generator = new Random();
    public String name;

    public void feed() {
        hunger--;
    }

    public void speak() {
        int size = words.size();
        String chosenWord = words.get(generator.nextInt(size));
        System.out.println(chosenWord);
        reduceBoredom();
    }

    public void teach(String word) {
        words.add(word);
    }

    public void tick() {
        hunger++;
        boredom++;
    }

    public void printStats() {
        System.out.println("Hunger: " + hunger + " Boredom: " + boredom + " Words: " + words + " Name: " + name + " isAlive: " + isAlive);
    }

    public boolean getAlive() {
        if (boredom > 10 && hunger > 10) {
            isAlive = false;
        }
        return isAlive;
    }

    private void reduceBoredom() {
        boredom--;
    }
}
