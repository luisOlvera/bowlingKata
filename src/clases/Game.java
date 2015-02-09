package clases;

/**
 * Created by root on 9/02/15.
 */
public class Game {
    int score=0;
    int[] rolls = new int[21];
    int indexRoll =0;

   public void roll(int pins){
    rolls[indexRoll++]=pins;
       if (rolls[indexRoll-1]==10 && (indexRoll-1)%2==0)
           indexRoll++;

   }

    public int score (){
        indexRoll=0;
        for(int indexFrame=0;indexFrame<10; indexFrame++)
        {
            if ( isStrike(indexRoll) )
                score += addStrikeBono(indexRoll);
            else
            score += withoutBono(indexRoll);
            indexRoll+=2;
        }
    return score;
    }

    public boolean isStrike(int indexRoll){
        return rolls[indexRoll]==10;
    }

    public  int addStrikeBono(int indexRoll){
        if (isStrike(indexRoll+2))
            return  20 +rolls[indexRoll+4];
        else
            return  10 + rolls[indexRoll +2] +rolls[indexRoll+3];
    }

    public  int withoutBono(int indexRoll){
        return rolls[indexRoll] +rolls[indexRoll+1];
    }

}
