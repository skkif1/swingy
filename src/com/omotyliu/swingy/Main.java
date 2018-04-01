package com.omotyliu.swingy;

import com.omotyliu.swingy.console.ConsoleUiManager;
import com.omotyliu.swingy.game.GameController;

public class Main
{
    public static void main(String[] args)
    {

        new GameController(new ConsoleUiManager()).createPlayer();
    }
}
