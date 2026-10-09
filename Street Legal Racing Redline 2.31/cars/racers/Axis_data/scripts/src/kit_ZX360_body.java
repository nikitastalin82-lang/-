package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_ZX360_body extends Set
{
	public kit_ZX360_body( int id )
	{
		super( id );
		name = "Axis ZX360 body kit";
		description = "Body kit for Axis ZX360. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Axis:0x000000CFr ); // F bumper 3
		inv.insertItem( cars.racers.Axis:0x000000DAr ); // hood 3
		inv.insertItem( cars.racers.Axis:0x000000E1r ); // R bumper 3
		inv.insertItem( cars.racers.Axis:0x000000DDr ); // L sideskirt 3
		inv.insertItem( cars.racers.Axis:0x000000E4r ); // R sideskirt 3
		inv.insertItem( cars.racers.Axis:0x000000F4r ); // L mirror 2
		inv.insertItem( cars.racers.Axis:0x000000F5r ); // R mirror 2
		inv.insertItem( cars.racers.Axis:0x000000E7r ); // R wing 2
	}
}
