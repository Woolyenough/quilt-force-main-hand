package net.wooly.force_main_hand.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Arm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(at = @At("HEAD"), method = "getMainArm", cancellable = true)
    private void forceLeftHandForLocalPlayer(CallbackInfoReturnable<Arm> cir) {
        cir.setReturnValue(MinecraftClient.getInstance().options.mainArm);
    }
}