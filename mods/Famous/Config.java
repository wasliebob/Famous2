package mods.Famous;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

//Items


//Tools


//Blocks


//General
public static boolean config2;
public static void loadConfig(FMLPreInitializationEvent e){
Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file

config.load(); //Loads it



//Item ID's

//Tool ID's


//Block ID's


//General
config2 = config.get(config.CATEGORY_GENERAL, "Budder", false).getBoolean(true);

config.save(); //Saves the file

}

}
