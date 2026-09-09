package example.mod;

import example.mod.block.ExampleBlock;
import net.minecraft.src.*;

import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

public class ExampleMod extends BaseMod {

    //this will generate config file somewhere
    @MLProp(name="Example Block's ID")
    public static int exampleId = 255;

    Block exampleBlock;

    public ExampleMod() {
        System.out.println("[ExampleMod] Initializing");
        readCustomLang();
        exampleBlock = new ExampleBlock(exampleId).setBlockName("smiles");
    }

    @Override
    public String Version() {
        return "1.0";
    }

    //There will be api for reading custom lang file soon, this is placeholder for now
    public void readCustomLang() {
        try {
            Properties prop = new Properties();
            prop.load(new InputStreamReader(ExampleMod.class.getResourceAsStream("/assets/example_mod/lang/en_US.lang")));
            for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                ModLoader.AddLocalization((String)entry.getKey(), (String)entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
