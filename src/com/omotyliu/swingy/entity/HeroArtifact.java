package com.omotyliu.swingy.entity;

import com.omotyliu.swingy.ResourceLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HeroArtifact {

    public static final List<HeroArtifact> artifacts = new ArrayList<>();


    static {
        File artifactsToCreate = new ResourceLoader().getArtifactsFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(artifactsToCreate))) {
            String artifactLine;

            while ((artifactLine = reader.readLine()) != null) {
                String[] artifactAttributes = artifactLine.split(",");
                HeroArtifact artifact = new HeroArtifact();
                artifact.artifactType = artifactAttributes[0];
                artifact.artifactName = artifactAttributes[1];
                artifact.artifactAttack = Integer.valueOf(artifactAttributes[2].trim());
                artifact.artifactRange = Integer.valueOf(artifactAttributes[3].trim());
                artifact.artifactDefence = Integer.valueOf(artifactAttributes[4].trim());
                artifact.hitPoints = Integer.valueOf(artifactAttributes[5].trim());
                artifact.artifactHp = Integer.valueOf(artifactAttributes[6].trim());
                artifact.artifactCoast = Integer.valueOf(artifactAttributes[7].trim());
                artifacts.add(artifact);
            }

        } catch (IOException ex) {
            //
        }
    }

    public String artifactType;
    public String artifactName;
    public int artifactAttack;
    public int artifactRange;
    public int artifactDefence;
    public int hitPoints;
    public int artifactHp;
    public int artifactCoast;


    public static List<HeroArtifact> getArtifacts() {
        return artifacts;
    }

    @Override
    public String toString()
    {
        return "artifactType='" + artifactType +
                ", artifactName='" + artifactName +
                ", artifactAttack=" + artifactAttack +
                ", artifactRange=" + artifactRange +
                ", artifactDefence=" + artifactDefence +
                ", hitPoints=" + hitPoints +
                ", artifactHp=" + artifactHp +
                ", artifactCoast=" + artifactCoast;
    }
}
