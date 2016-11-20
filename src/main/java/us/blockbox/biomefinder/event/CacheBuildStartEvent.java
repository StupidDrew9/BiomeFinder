package us.blockbox.biomefinder.event;

import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

//Created 11/20/2016 12:59 AM
public final class CacheBuildStartEvent extends Event{
	private static final HandlerList handlers = new HandlerList();
	private final World world;
	private final int centerX;
	private final int centerZ;

	public CacheBuildStartEvent(World world,int centerX,int centerZ){
		super();
		this.world = world;
		this.centerX = centerX;
		this.centerZ = centerZ;
	}

	@Override
	public HandlerList getHandlers(){
		return handlers;
	}

	public static HandlerList getHandlerList(){
		return handlers;
	}

	public World getWorld(){
		return world;
	}

	public int getCenterX(){
		return centerX;
	}

	public int getCenterZ(){
		return centerZ;
	}
}
