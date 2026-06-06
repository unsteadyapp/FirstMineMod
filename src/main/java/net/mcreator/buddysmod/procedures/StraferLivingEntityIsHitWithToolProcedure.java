package net.mcreator.buddysmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class StraferLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		Vec3 vectornew = Vec3.ZERO;
		vectornew = ((sourceentity.getLookAngle()).normalize()).scale(10);
		if (!(Blocks.AIR == (world.getBlockState(BlockPos.containing(x - vectornew.x(), y - vectornew.y(), z - vectornew.z()))).getBlock())) {
			world.setBlock(BlockPos.containing(x - vectornew.x(), y - vectornew.y(), z - vectornew.z()), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - vectornew.x(), y - vectornew.y() + 1, z - vectornew.z()), Blocks.AIR.defaultBlockState(), 3);
		}
		{
			Entity _ent = sourceentity;
			_ent.teleportTo((x - vectornew.x()), (y - vectornew.y()), (z - vectornew.z()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((x - vectornew.x()), (y - vectornew.y()), (z - vectornew.z()), _ent.getYRot(), _ent.getXRot());
		}
	}
}