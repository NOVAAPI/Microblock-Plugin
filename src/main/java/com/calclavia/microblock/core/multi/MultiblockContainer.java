package com.calclavia.microblock.core.multi;

import com.calclavia.microblock.core.common.BlockComponent;
import nova.core.block.Block;

/**
 * A component attached to any block that is a multiblock container.
 * @author Calclavia
 */
public class MultiblockContainer extends BlockComponent {

	public final Block containedBlock;

	//Used for data retention and ticking?
	public boolean isPrimary;

	/**
	 * Creates a new multiblock container
	 * @param containerBlock The container block
	 * @param containedBlock The block being contained.
	 */
	public MultiblockContainer(Block containerBlock, Block containedBlock) {
		super(containerBlock);
		assert containedBlock.has(Multiblock.class);
		this.containedBlock = containedBlock;
		containedBlock.get(Multiblock.class).containers.add(this);
	}
}
