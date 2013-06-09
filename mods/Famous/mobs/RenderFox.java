package mods.Famous.mobs;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderFox extends RenderLiving
{
protected ModelFox model;

public RenderFox (ModelFox ModelFox, float f)
{
super(ModelFox, f);
model = ((ModelFox)mainModel);
}

public void renderTutorial(BossFox entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((BossFox)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((BossFox)par1Entity, par2, par4, par6, par8, par9);
    }
}
