package com.omotyliu.swingy.console;

import com.omotyliu.swingy.entity.HeroArtifact;
import com.omotyliu.swingy.entity.HeroClass;
import com.omotyliu.swingy.entity.Player;
import com.omotyliu.swingy.game.GameDao;

public class PlayerCreationStep
{

    private static final String CREATION_MENU = "***set all fields***\nto exit from this menu type \"exit\"\n %s\n";


    private Player player;

    public Player createPlayer()
    {
        player = new Player();

        System.out.print(String.format(CREATION_MENU, player));

        createName();
        System.out.println("Player: " + player);
        chooseClass();
        System.out.println("Player: " + player);
        buyArtifacts();
        System.out.println("Player: " + player);
        GameDao.savePlayer(player);
        return player;
    }


    private boolean createName()
    {
        System.out.println("name:> ");
        String answer = ConsoleUiManager.readInput();
        player.setName(answer);
        return true;
    }

    private boolean chooseClass()
    {
        System.out.print("***Choose hero class***\n");
        HeroClass[] possibleValues = HeroClass.values();
        for (HeroClass constant : possibleValues)
        {
            System.out.println(constant);
        }

        System.out.print("class:> ");
        String answer = ConsoleUiManager.readInput();
        player.setHeroClass(HeroClass.valueOf(answer));
        return true;
    }

    private boolean buyArtifacts()
    {
        int i = 0;

        System.out.print("***type artifact number to buy***\ntype \"ready\" to finish\n");

        for (HeroArtifact artifact: HeroArtifact.artifacts)
        {
            System.out.println(i++ + " " + artifact);
        }

        while (true)
        {
            String answer = ConsoleUiManager.readInput();
            switch (answer)
            {
                case "ready":
                    return true;
                default:
                    HeroArtifact toBuy = HeroArtifact.artifacts.get(Integer.parseInt(answer));
                    player.buyArtifact(toBuy);
                    System.out.println("Player: " + player);
                    System.out.println("artifact number: > ");
            }
        }
    }
}
