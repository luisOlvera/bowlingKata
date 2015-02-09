package clases;

/**
 * Created by root on 9/02/15.
 */
public class Game {
    int score=0;
    int[] rolls = new int[21];
    int roll =0;

   public void roll(int pins){
    rolls[roll++]=pins;

   }

    public int score (){
        int indexRoll=0;
        for(int indexFrame=0;indexFrame<10; indexFrame++)
        {
            score += rolls[indexRoll];
        }
    return score;
    }

}
