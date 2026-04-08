package ModRootName;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.minecraft.client.renderer.RenderPipelines;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class YourModElementName {
	private static final ResourceLocation YOUR_BAR_NAME =
        ResourceLocation.fromNamespaceAndPath("mod id", "textures/yourfile path/your_bar_name.png");

    //Optional
    @SubscribeEvent(priority = EventPriority.NORMAL)

	public static void eventHandler(RenderGuiEvent.Pre event) {
        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null) return;
        GuiGraphics gui = event.getGuiGraphics();

        // In this case we will use MCreator's variable system

        float value = (float)player.getData(net.drakona.*YourModID_All_lowercase*.network.*YourModID*ModVariables.PLAYER_VARIABLES).Value;
        // The *YourModID* can be found in workspace file explorer it'll be *YourModName*Mod.java
        float maxValue = (float)player.getData(net.*YourName*.*YourModID_All_lowercase*.network.*YourModID*ModVariables.PLAYER_VARIABLES).MaxValue;
        
        // Offsets/Positions
        int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		
		// X value
        int x = 1;
        // Y value
        int y = h - 10;

		float percentBar = value <= 0 ? 0 : (value / maxValue);
		int filledBar = percent >= 1 ? *TextureWidth* : (int)(percentBar1 * *TextureWidth*) ;

		// Render bar
		gui.blit(net.minecraft.client.renderer.RenderPipelines.GUI_TEXTURED,
		    *YOUR_BAR_NAME*,
		    x, y,
		    0, 0,
		    filledBar, *TextureHeight*,
		    *TextureWidth*, *TextureHeight*
		);	
    }
}
