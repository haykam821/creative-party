package supercoder79.creativeparty.map;

import net.minecraft.world.gen.chunk.ChunkGenerator;

public class CreativePartyMap {
	public ChunkGenerator chunkGenerator() {
		return new CreativePartyChunkGenerator();
	}
}