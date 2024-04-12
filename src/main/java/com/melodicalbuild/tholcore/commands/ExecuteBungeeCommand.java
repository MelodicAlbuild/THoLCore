package com.melodicalbuild.tholcore.commands;

import com.google.common.collect.Iterables;
import com.melodicalbuild.tholcore.THoLCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ExecuteBungeeCommand implements CommandExecutor {
    THoLCore plugin;

    public ExecuteBungeeCommand(THoLCore plugin) {
        this.plugin = plugin;
    }

    private void sendToBungee(String message) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(stream);
        try {
            out.writeUTF("command");
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Note the "Return". It is the channel name that we registered in our Main class of Bungee plugin.
        Player player = Iterables.getFirst(Bukkit.getOnlinePlayers(), null);

        player.sendPluginMessage(plugin, "melodicalbuild:send", stream.toByteArray());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /executebungee <command>");
            return false;
        }
        // Here, we're looping through each argument.

        StringBuilder cmd = new StringBuilder();

        for (String arg : args) {
            cmd.append(arg).append(" ");
        }

        sendToBungee(cmd.toString());

        sender.sendMessage(ChatColor.GREEN + "Command: '/" + cmd + "' has been executed on all servers.");
        return true;
    }
}
