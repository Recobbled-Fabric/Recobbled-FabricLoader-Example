package example.mod.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(GuiMainMenu.class)
public class GuiMainMenuMixin {

    @WrapOperation(method="initGui", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;hideQuitButton:Z"))
    public boolean dontHideQuitButton(Minecraft instance, Operation<Boolean> original) {
        return false;
    }
}
