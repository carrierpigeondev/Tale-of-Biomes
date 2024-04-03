package net.nwtg.taleofbiomes.client.gui;

import net.nwtg.taleofbiomes.world.inventory.BasicToolTableMenuRecipeBookMenu;
import net.nwtg.taleofbiomes.procedures.BasicToolTableRecipeHelperRecipeNameScriptProcedure;
import net.nwtg.taleofbiomes.network.BasicToolTableMenuRecipeBookButtonMessage;
import net.nwtg.taleofbiomes.TaleOfBiomesMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BasicToolTableMenuRecipeBookScreen extends AbstractContainerScreen<BasicToolTableMenuRecipeBookMenu> {
	private final static HashMap<String, Object> guistate = BasicToolTableMenuRecipeBookMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_recipe_helper_button_back;
	ImageButton imagebutton_recipe_helper_button_forward;
	ImageButton imagebutton_kiln_light_on;

	public BasicToolTableMenuRecipeBookScreen(BasicToolTableMenuRecipeBookMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tale_of_biomes:textures/screens/basic_tool_table_menu_recipe_book.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("tale_of_biomes:textures/screens/recipe_helper_background.png"), this.leftPos + -109, this.topPos + 0, 0, 0, 104, 166, 104, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.basic_tool_table_menu_recipe_book.label_basic_tool_table"), 7, 6, -12566464, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tale_of_biomes.basic_tool_table_menu_recipe_book.label_inventory"), 7, 73, -12566464, false);
		guiGraphics.drawString(this.font,

				BasicToolTableRecipeHelperRecipeNameScriptProcedure.execute(world, entity), -102, 6, -12566464, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_recipe_helper_button_back = new ImageButton(this.leftPos + -83, this.topPos + 88, 27, 18, 0, 0, 18, new ResourceLocation("tale_of_biomes:textures/screens/atlas/imagebutton_recipe_helper_button_back.png"), 27, 36, e -> {
			if (true) {
				TaleOfBiomesMod.PACKET_HANDLER.sendToServer(new BasicToolTableMenuRecipeBookButtonMessage(0, x, y, z));
				BasicToolTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_recipe_helper_button_back", imagebutton_recipe_helper_button_back);
		this.addRenderableWidget(imagebutton_recipe_helper_button_back);
		imagebutton_recipe_helper_button_forward = new ImageButton(this.leftPos + -56, this.topPos + 88, 27, 18, 0, 0, 18, new ResourceLocation("tale_of_biomes:textures/screens/atlas/imagebutton_recipe_helper_button_forward.png"), 27, 36, e -> {
			if (true) {
				TaleOfBiomesMod.PACKET_HANDLER.sendToServer(new BasicToolTableMenuRecipeBookButtonMessage(1, x, y, z));
				BasicToolTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_recipe_helper_button_forward", imagebutton_recipe_helper_button_forward);
		this.addRenderableWidget(imagebutton_recipe_helper_button_forward);
		imagebutton_kiln_light_on = new ImageButton(this.leftPos + 11, this.topPos + 39, 8, 8, 0, 0, 8, new ResourceLocation("tale_of_biomes:textures/screens/atlas/imagebutton_kiln_light_on.png"), 8, 16, e -> {
			if (true) {
				TaleOfBiomesMod.PACKET_HANDLER.sendToServer(new BasicToolTableMenuRecipeBookButtonMessage(2, x, y, z));
				BasicToolTableMenuRecipeBookButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kiln_light_on", imagebutton_kiln_light_on);
		this.addRenderableWidget(imagebutton_kiln_light_on);
	}
}
