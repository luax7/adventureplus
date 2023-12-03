package net.luax7.adventureplus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;

public class AdventurePlusClientInitializer implements ClientModInitializer {
    private static KeyBinding Interact ;
    @Override
    public void onInitializeClient(){
        Interact = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "Interact",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F,
                "category.adventureplus.test"
        ));

        //Checks for interaction with players for opening the context menu
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
                HitResult hit = client.crosshairTarget;
                if(hit.getType() == HitResult.Type.ENTITY){
                    EntityHitResult EntityResult = (EntityHitResult)hit;
                    Entity entity = EntityResult.getEntity();
                    if(entity.getType() == EntityType.PLAYER){

                        //Open the context menu
                        if(Interact.wasPressed()){
                            
                        }

                    }
                }

        });
    }
}
