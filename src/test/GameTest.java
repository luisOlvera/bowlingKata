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
    public void oneStrikeSecondFrame4_1NextZero_Score20 ()throws Exception{
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
    public void twoStrikeSecondFrame3_5AllNextZero_Score49 ()throws Exception{
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
    public void firstAndLastFrameStrikeSecondFrame3_5AllOthersZero_Score41 ()throws Exception {
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

    @org.junit.Test
    public void oneSpareSecondFrame4_1AllNextZero_Score19 ()throws Exception{
        Game gameBowling= new Game();
        gameBowling.roll(2);
        gameBowling.roll(8);

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
        Assert.assertEquals(finalScore, 19);

    }

    @org.junit.Test
    public void FirtsAndLastFrameSpareSecondFrame4_1AllNextZero_Score39 ()throws Exception {
        Game gameBowling = new Game();
        gameBowling.roll(2);
        gameBowling.roll(8);

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

        gameBowling.roll(3);
        gameBowling.roll(7);
        gameBowling.roll(10);

        finalScore = gameBowling.score();
        Assert.assertEquals(finalScore, 39);
    }

    @org.junit.Test
    public void fiveSpareAndfiveStrike_Score210 ()throws Exception {
        Game gameBowling = new Game();

        gameBowling.roll(9);
        gameBowling.roll(1);

        gameBowling.roll(7);
        gameBowling.roll(3);

        gameBowling.roll(7);
        gameBowling.roll(3);

        gameBowling.roll(8);
        gameBowling.roll(2);

        gameBowling.roll(8);
        gameBowling.roll(2);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);
        gameBowling.roll(0);
        gameBowling.roll(0);

        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 210);
    }

    @org.junit.Test
    public void NineStrikesAndZeros_Score240 ()throws Exception {
        Game gameBowling= new Game();
        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(10);

        gameBowling.roll(0);
        gameBowling.roll(0);


        finalScore=gameBowling.score();
        Assert.assertEquals(finalScore, 240);
    }

    @org.junit.Test
    public void FirtsFrame0_10SecondFrame1_1_AllnextZero_Score13 ()throws Exception {
        Game gameBowling= new Game();
        gameBowling.roll(0);
        gameBowling.roll(10);

        gameBowling.roll(1);
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
        Assert.assertEquals(finalScore, 13);
    }

    @org.junit.Test
    public void nineStrikewithFinalSpare_score270 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(0);
        g.roll(10);
        g.roll(10);

        finalScore=g.score();
        Assert.assertEquals(finalScore, 270);
    }

    @org.junit.Test
    public void allStrike_score300 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);
        g.roll(10);
        g.roll(10);

        finalScore=g.score();
        Assert.assertEquals(finalScore, 300);
    }
}