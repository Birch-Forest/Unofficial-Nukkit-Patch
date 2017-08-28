package com.Shanwer.Main;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;


/**
 * Created by AdminShanwer on 2017/7/5.
 * Last commit on 2017/8/26
 * Developers:Shanwer
 */
public class Patch extends PluginBase {
    @Override
    public void onEnable() {
        this.getLogger().warning(TextFormat.GREEN + "Unofficial Nukkit Patch enabled!Author:Shanwer");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isPlayer()) ((Player) sender).usedChunks.clear();
        sender.sendMessage(TextFormat.colorize("&3&b 区块已重发！"));
        return true;
    }
        }