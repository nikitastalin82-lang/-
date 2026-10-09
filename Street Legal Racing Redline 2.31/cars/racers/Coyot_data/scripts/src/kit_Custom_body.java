package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Custom_body extends Set
{
	public kit_Custom_body( int id )
	{
		super( id );
		name = "Coyot custom body kit";
		description = "Custom body kit for Coyot. Includes front bumper with a grill, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Coyot:0x00000101r ); // F bumper 2
		inv.insertItem( cars.racers.Coyot:0x000000F9r ); // R bumper 2
		inv.insertItem( cars.racers.Coyot:0x000000E0r ); // grill
		inv.insertItem( cars.racers.Coyot:0x000000E9r ); // F hood 2
		inv.insertItem( cars.racers.Coyot:0x000000FCr ); // R wing
		inv.insertItem( cars.racers.Coyot:0x000000DEr ); // L sideskirt 2
		inv.insertItem( cars.racers.Coyot:0x0000010Er ); // R sideskirt 2
		inv.insertItem( cars.racers.Coyot:0x000000EDr ); // L mirror 2
		inv.insertItem( cars.racers.Coyot:0x000000F5r ); // R mirror 2
	}
}
