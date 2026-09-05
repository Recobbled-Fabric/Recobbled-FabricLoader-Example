package example.mod;

import net.fabricmc.api.ClientModInitializer;

public class ExampleMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("[ExampleMod] Initializing");
    }
}
