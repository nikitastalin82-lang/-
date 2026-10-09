package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Replacement_body extends Set
{
	public kit_Replacement_body( int id )
	{
		super( id );
		name = "Baiern replacement body kit";
		description = "Replacement body kit for Baiern, includes bumpers and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.baiern:0x0000011Er ); // L sideskirt
		inv.insertItem( cars.racers.baiern:0x00000126r ); // R sideskirt

		inv.insertItem( cars.racers.baiern:0x0000011Dr ); // F bumper 2
		inv.insertItem( cars.racers.baiern:0x0000011Br ); // R bumper 2
	}
}
