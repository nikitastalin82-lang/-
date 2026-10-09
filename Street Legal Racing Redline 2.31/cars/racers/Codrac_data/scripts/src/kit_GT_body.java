package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GT_body extends Set
{
	public kit_GT_body( int id )
	{
		super( id );
		name = "Codrac GT body kit";
		description = "Body kit for Codrac GT. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Codrac:0x0000012Dr ); // F bumper 3
		inv.insertItem( cars.racers.Codrac:0x0000010Er ); // hood 3
		inv.insertItem( cars.racers.Codrac:0x0000012Er ); // R bumper 3
		inv.insertItem( cars.racers.Codrac:0x0000012Fr ); // R wing 3
		inv.insertItem( cars.racers.Codrac:0x00000132r ); // L mirror 3
		inv.insertItem( cars.racers.Codrac:0x00000131r ); // R mirror 3
		inv.insertItem( cars.racers.Codrac:0x00000130r ); // L sideskirt 3
		inv.insertItem( cars.racers.Codrac:0x00000133r ); // R sideskirt 3
	}
}
