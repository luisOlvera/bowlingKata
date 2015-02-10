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
       if (isStrike(indexRoll-1) && ! isRollOfFinalFrame(indexRoll-1))
           indexRoll++;

   }

    public boolean isStrike(int indexRoll){
        return rolls[indexRoll]==10 && (indexRoll)%2==0;
    }

    public boolean isRollOfFinalFrame( int indexRoll) {
        return indexRoll>17;
    }

    public int score (){
        indexRoll=0;
        for(int indexFrame=0;indexFrame<10; indexFrame++)
        {
            score += typeBonoByFrame(indexRoll);
            indexRoll+=2;
        }
        return score;
    }

    public  int typeBonoByFrame(int indexRoll) {
        if ( isStrike(indexRoll) )
            return addStrikeBono(indexRoll);
        else
            if (isSpare(indexRoll))
                return addSpareBono (indexRoll);
                else
                return addWithoutBono(indexRoll);
    }

    public boolean isSpare(int indexRoll){
        return rolls[indexRoll]+ rolls[indexRoll+1 ]>=10 ;
    }

    public  int addStrikeBono(int indexRoll){
        if( isRollOfFinalFrame(indexRoll))
            return  10+ rolls[indexRoll +1]+ rolls[indexRoll +2];
        else
            return addStrikeBonoFramewithTwoRoll(indexRoll);
    }

    public int addStrikeBonoFramewithTwoRoll(int indexRoll) {
        if (isStrike(indexRoll+2))
            return  20 +rolls[indexRoll+4];
        else
            return  10 + rolls[indexRoll +2] +rolls[indexRoll+3];
    }

    public  int addSpareBono(int indexRoll){
        return  10+  rolls[indexRoll +2];
    }

    public  int addWithoutBono(int indexRoll){
        return rolls[indexRoll] +rolls[indexRoll+1];
    }

}
