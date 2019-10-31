package org.itxtech.nemisys.network.protocol.mcpe;

/**
 * @author Nukkit Project Team
 */
public class AddPaintingPacket extends DataPacket {

    public long entityUniqueId;
    public long entityRuntimeId;

    @Override
    public void decode() {
        entityUniqueId = getEntityUniqueId();
        entityRuntimeId = getEntityRuntimeId();
    }

    @Override
    public void encode() {
    }

    @Override
    public byte pid() {
        return ProtocolInfo.ADD_PAINTING_PACKET;
    }
}
