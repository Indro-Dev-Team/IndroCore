package io.github.indroDevTeam.indroCore.utils;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class YmlUtils {
    private final Plugin plugin;
    private File file;

    public YmlUtils(Plugin plugin) {
        this.plugin = plugin;
    }

    public void createFile(String fileName) {
        try {
            File file1 = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + fileName + ".json");
            if (file1.createNewFile()) {
                System.out.println("File created: " + file1.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Save a default file saved in a file
     * @param file The default file saved in a plugin
     * @param fileName The file that you want to save in it
     */
    public void saveDefaultFile(File file, String fileName) {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
