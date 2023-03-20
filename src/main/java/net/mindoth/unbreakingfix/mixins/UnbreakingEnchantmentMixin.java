package net.mindoth.unbreakingfix.mixins;

import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Random;

@Mixin(UnbreakingEnchantment.class)
public class UnbreakingEnchantmentMixin {

    @Overwrite
    public static boolean shouldIgnoreDurabilityDrop(ItemStack p_92097_0_, int p_92097_1_, Random p_92097_2_) {
            return p_92097_2_.nextInt(p_92097_1_ + 1) > 0;
    }
}
