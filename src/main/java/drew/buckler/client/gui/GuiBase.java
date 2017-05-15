package drew.buckler.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiBase extends GuiScreen{
	
	public GuiButton a;

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		this.drawRect(15, 30, 15, 30, 0);
		super.drawScreen(mouseX,  mouseY,  partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
	    return false;
    }
	
	@Override
	public void initGui() {
		this.buttonList.add(this.a = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 24, "This is button a"));
		
	}
}
