package com.gmail.nossr50.config.hocon.commands;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigCommands {

    @Setting(value = "Admin-Chat", comment = "Settings related to the admin chat command and chatting modes.")
    private ConfigCommandsAdminChat adminChat = new ConfigCommandsAdminChat();

    public ConfigCommandsAdminChat getAdminChat() {
        return adminChat;
    }

    public String getAdminChatPrefix() {
        return getAdminChat().getAdminChatPrefix();
    }

    public boolean isUseDisplayNames() {
        return getAdminChat().isUseDisplayNames();
    }
}
