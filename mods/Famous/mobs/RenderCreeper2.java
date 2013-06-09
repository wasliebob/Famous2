package mods.Famous.mobs;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderCreeper2 extends RenderLiving
{
protected ModelCreeper model;

public RenderCreeper2 (ModelCreeper ModelCreeper, float f)
{
super(ModelCreeper, f);
model = ((ModelCreeper)mainModel);
}

public void renderTutorial(Creeper2 entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((Creeper2)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((Creeper2)par1Entity, par2, par4, par6, par8, par9);
    }
}
