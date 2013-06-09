package mods.Famous;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PackageHandler implements IPacketHandler {

	@Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload payload, Player player) {
        DataInputStream data = new DataInputStream(new ByteArrayInputStream(payload.data));
    }

}