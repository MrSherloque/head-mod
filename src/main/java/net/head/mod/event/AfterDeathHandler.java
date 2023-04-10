package net.head.mod.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.head.mod.networking.ModMessages;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class AfterDeathHandler implements ServerLivingEntityEvents.AfterDeath {

    @Override
    public void afterDeath(LivingEntity entity, DamageSource damageSource) {
        if(entity instanceof PlayerEntity)
        {
            entity.sendMessage(Text.literal(entity.getName().getString() + "died"));
        }
    }
}
