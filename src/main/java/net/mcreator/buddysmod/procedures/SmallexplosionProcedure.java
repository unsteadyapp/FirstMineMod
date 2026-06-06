package net.mcreator.buddysmod.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class SmallexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double size = 0;
		size = 1;
		sx = (-1) * size;
		for (int index0 = 0; index0 < (int) (2 * size); index0++) {
			sy = (-1) * size;
			for (int index1 = 0; index1 < (int) (2 * size); index1++) {
				sz = (-1) * size;
				for (int index2 = 0; index2 < (int) (2 * size); index2++) {
					if (1 == Mth.nextInt(RandomSource.create(), 1, (int) Math.max(Math.abs(sz), Math.max(Math.abs(sx), Math.abs(sy))))) {
						{
							BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}