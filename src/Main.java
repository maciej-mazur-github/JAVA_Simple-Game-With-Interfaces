import com.game.ISaveable;
import com.game.Monster;
import com.game.Player;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 12, 100);
        System.out.println(tim);
        ISaveable monster = new Monster("Werewolf", 18, 200);
        tim.saveObject(tim);
        //tim.loadToObject(tim);
       // System.out.println(tim);
        System.out.println(tim.getStrength());
        System.out.println("Monster strength: " + ((Monster)monster).getStrength());


        /*ISaveable character = new Player("Ron", 14, 140);
        saveObject(character);

        loadToObject(new Monster("Werewolf", 18, 200));*/
    }




}
