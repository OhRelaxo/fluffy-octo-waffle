package com.nohunger.mixin;

import net.minecraft.entity.player.HungerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HungerManager.class)
public class HungerManagerMixin {
    
    /**
     * Prevents hunger from decreasing by canceling the update method.
     * This effectively disables the hunger mechanic.
     */
    @Inject(method = "update", at = @At("HEAD"), cancellable = true)
    private void onUpdate(CallbackInfo ci) {
        HungerManager hungerManager = (HungerManager) (Object) this;
        
        // Keep food level at maximum (20) and saturation at maximum (5.0)
        // This ensures the player never gets hungry
        if (hungerManager.getFoodLevel() < 20) {
            hungerManager.setFoodLevel(20);
        }
        if (hungerManager.getSaturationLevel() < 5.0f) {
            hungerManager.setSaturationLevel(5.0f);
        }
        
        // Cancel the normal hunger update to prevent hunger from decreasing
        ci.cancel();
    }
}
