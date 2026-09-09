package example.mod.block;

import forge.ITextureProvider;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class ExampleBlock extends Block implements ITextureProvider {
    public ExampleBlock(int i1) {
        super(i1, Material.iron);
        blockIndexInTexture = 0;
    }

    //Custom texture atlas
    @Override
    public String getTextureFile() {
        return "/assets/example_mod/textures/smile_atlas.png";
    }
}
