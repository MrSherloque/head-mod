package net.head.mod.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.head.mod.networking.packet.ExampleC2SPacket;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier EXAMPLE_ID = new Identifier("heads", "example");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::recieve);
    }

    public static void registerS2CPackets() {

    }
}
