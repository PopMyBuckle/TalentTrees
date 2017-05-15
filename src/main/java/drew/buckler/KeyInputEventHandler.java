package drew.buckler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import drew.buckler.network.bGUIHandler;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KeyInputEventHandler {

@SideOnly(Side.CLIENT)
@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
public void onEvent(KeyInputEvent event)
{
    // DEBUG
    System.out.println("Key Input Event");

    // make local copy of key binding array
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
   
    // check each enumerated key binding type for pressed and take appropriate action
    if (keyBindings[0].isPressed()) 
    {
        // DEBUG
        System.out.println("Key binding ="+keyBindings[0].getKeyDescription());
        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;
        

		
        }

    }
  }