package com.omotyliu.swingy.console;

import com.omotyliu.swingy.entity.Player;

public class PlayerCreationStep
{

    private static final String CREATION_MENU = "***set all fields***\n type field name:value (example \"name:skkif\"), to finish type \"ready\"\n to exit from this menu type \"exit\"\nname:value > " ;


    private Player player;

    public Player createPlayer()
    {
        while (true)
        {
            System.out.print(CREATION_MENU);
            String answer = ConsoleUiManager.readInput();

            switch (answer)
            {

                case "exit":
                    return null;

                case "ready":
                    break;

            }
            break;

        }

        return null;
    }
}
