package com.ipedg.minecraft;

import Gui.Login;
import lk.vexview.api.VexViewAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MCbank extends JavaPlugin{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            VexViewAPI.openGui((Player) sender,new Login());
        }
        return super.onCommand(sender, command, label, args);
    }



    @Override
    public void onDisable() {
        System.out.println("加载111111111111111111");
        super.onDisable();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }
}
