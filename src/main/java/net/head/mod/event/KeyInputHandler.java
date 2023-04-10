package net.head.mod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.head.mod.networking.ModMessages;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.PacketByteBuf;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TUTORIAL = "key.category.headmod.tutorial";
    public static final String KEY_CATEGORY_TEST = "key.headmod.test";

    public static KeyBinding custom_keybind;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(custom_keybind.wasPressed()) {
                ClientPlayNetworking.send(ModMessages.EXAMPLE_ID, PacketByteBufs.create());
            }
        });
    }

    public static void register() {
        custom_keybind = KeyBindingHelper.registerKeyBinding(new KeyBinding(
           KEY_CATEGORY_TEST,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TUTORIAL
        ));

        registerKeyInputs();
    }

}
