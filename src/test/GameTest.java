package test;

import clases.Game;
import org.junit.Assert;

import static org.junit.Assert.*;

public class GameTest {

    int finalScore=0;
    @org.junit.Test
    public void allZero_Score0() throws Exception {
        Game gameBowling= new Game();
        for (int indexRoll=0;indexRoll<20; indexRoll++)
        {
            gameBowling.roll(0);
        }

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 0);

    }

    @org.junit.Test
    public void withoutStrikeandSpare_Score30() throws Exception {
        Game gameBowling= new Game();
        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        gameBowling.roll(2);
        gameBowling.roll(1);

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 30);
    }

    @org.junit.Test
    public void oneStrikeAllNextZero_Score20 ()throws Exception{
        Game gameBowling= new Game();
        gameBowling.roll(10);


        gameBowling.roll(4);
        gameBowling.roll(1);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 20);

    }

    @org.junit.Test
    public void twoStrikeAllNextZero_Score49 ()throws Exception{
        Game gameBowling= new Game();
        gameBowling.roll(10);


        gameBowling.roll(10);


        gameBowling.roll(3);
        gameBowling.roll(5);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 49);

    }

    @org.junit.Test
    public void firstAndLastFrameStrikeAllOthersZero_Score41 ()throws Exception {
        Game gameBowling= new Game();
        gameBowling.roll(10);

        gameBowling.roll(3);
        gameBowling.roll(5);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(0);
        gameBowling.roll(0);

        gameBowling.roll(10);
        gameBowling.roll(1);
        gameBowling.roll(4);

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 41);
    }
}