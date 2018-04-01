package com.omotyliu.swingy;


import java.io.File;

public class ResourceLoader
{

    public File getArtifactsFile()
    {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource("com/omotyliu/swingy/artifacts").getFile());
    }

    public File getPlayerFile()
      {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource("com/omotyliu/swingy/players").getFile());
    }


}
