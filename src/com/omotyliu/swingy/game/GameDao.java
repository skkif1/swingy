package com.omotyliu.swingy.game;

import com.omotyliu.swingy.ResourceLoader;
import com.omotyliu.swingy.entity.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GameDao
{
    public static void savePlayer(Player player)
    {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new  ResourceLoader().getPlayerFile())))
        {
            out.writeObject(player);
            out.flush();
            out.close();
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }

    }
}