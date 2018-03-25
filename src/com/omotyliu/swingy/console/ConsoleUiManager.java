package com.omotyliu.swingy.console;

import com.omotyliu.swingy.entity.Player;
import com.omotyliu.swingy.game.UiManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleUiManager extends UiManager {

    private static final String mainMenu;

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        mainMenu = "create player (press c) \nselect player (press s) \n";
    }


    @Override
    public Player createPlayer()
    {
        System.out.println(mainMenu);
        String answer = readInput();

        if (answer.equalsIgnoreCase("c"))
            return new PlayerCreationStep().createPlayer();
        if (answer.equalsIgnoreCase("s"))
            return null;
        return null;
    }


    static String readInput()
    {
        try {

            String answer = reader.readLine();
            Runtime.getRuntime().exec("clear");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            return answer;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    protected void finalize() throws Throwable {
        super.finalize();
        reader.close();
    }
}
