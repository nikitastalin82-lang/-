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
		name = "Yotta custom body kit";
		description = "Custom body kit for Yotta. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Yotta:0x000000E5r ); // F bumper 2
		inv.insertItem( cars.racers.Yotta:0x000000E1r ); // hood 2
		inv.insertItem( cars.racers.Yotta:0x000000E0r ); // R bumper 2
		inv.insertItem( cars.racers.Yotta:0x000000DEr ); // L sideskirt 2
		inv.insertItem( cars.racers.Yotta:0x000000E3r ); // R sideskirt 2
		inv.insertItem( cars.racers.Yotta:0x000000E2r ); // L mirror 2
		inv.insertItem( cars.racers.Yotta:0x000000E4r ); // R mirror 2
		inv.insertItem( cars.racers.Yotta:0x000000EBr ); // R wing 2
	}
}
