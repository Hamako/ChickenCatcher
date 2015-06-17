package com.distractionsoftware.chickencatcher;

/**
 * Created by Francis on 6/14/2015.
 */
public class GameInfo {
    private static final int STARTING_LIVES = 10;
    private static int livesLeft = STARTING_LIVES;

    public static int getLivesLeft() {
        return livesLeft;
    }

    public static void setLivesLeft(int livesLeft) {
        GameInfo.livesLeft = livesLeft;
    }
}
