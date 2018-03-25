package com.omotyliu.swingy.game;

public class GameController
{
    private UiManager ui;

    public GameController(UiManager ui)
    {
        this.ui = ui;
    }

    public void createPlayer()
    {
        ui.createPlayer();
    }

    public void renderMainMenu()
    {

    }
}
