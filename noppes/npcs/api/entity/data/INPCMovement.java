package noppes.npcs.api.entity.data;

public interface INPCMovement {

	public int getAnimation();

	public void setAnimation(int type);

	/**
	 * @return Returns the npcs current animation. E.g. when npc is set to LYING it wont be lying while walking so it will be NORMAL
	 * @see noppes.npcs.api.constants.AnimationType
	 */
	public int getCurrentAnimation();

	/**
	 * @param bo Whether or not the npc will try to return to his home position
	 */
	public void setReturnsHome(boolean bo);

	public boolean getReturnsHome();
}