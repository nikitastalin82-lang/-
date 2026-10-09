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
		name = "Remo custom body kit";
		description = "Custom Body kit for Remo. Includes front bumper with a grill, hood, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Remo:0x000000B5r ); // F bumper 2
		inv.insertItem( cars.racers.Remo:0x000000C0r ); // hood 2
		inv.insertItem( cars.racers.Remo:0x000000B8r ); // grill 2
		inv.insertItem( cars.racers.Remo:0x000000C8r ); // R bumper 2
		inv.insertItem( cars.racers.Remo:0x000000C5r ); // L sideskirt 2
		inv.insertItem( cars.racers.Remo:0x000000CEr ); // R sideskirt 2
	}
}
