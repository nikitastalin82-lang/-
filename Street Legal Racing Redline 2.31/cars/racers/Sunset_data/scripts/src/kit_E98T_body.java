package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_E98T_body extends Set
{
	public kit_E98T_body( int id )
	{
		super( id );
		name = "Sunset E98T body kit";
		description = "Body kit for Sunset E98T. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Sunset:0x000000F4r ); // F bumper 2
		inv.insertItem( cars.racers.Sunset:0x00000120r ); // hood 2
		inv.insertItem( cars.racers.Sunset:0x000000F6r ); // R bumper 2
		inv.insertItem( cars.racers.Sunset:0x00000108r ); // L sideskirt 2
		inv.insertItem( cars.racers.Sunset:0x0000010Dr ); // R sideskirt 2
		inv.insertItem( cars.racers.Sunset:0x00000112r ); // L mirror 2
		inv.insertItem( cars.racers.Sunset:0x00000113r ); // R mirror 2
		inv.insertItem( cars.racers.Sunset:0x000000F3r ); // R wing 
	}
}
