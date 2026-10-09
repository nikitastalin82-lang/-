package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tuner_body extends Set
{
	public kit_Tuner_body( int id )
	{
		super( id );
		name = "Coyot tuning body kit";
		description = "Tuning body kit for Coyot. Includes front bumper with a grill, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Coyot:0x00000100r ); // F bumper 3
		inv.insertItem( cars.racers.Coyot:0x000000FAr ); // R bumper 3
		inv.insertItem( cars.racers.Coyot:0x000000E0r ); // grill
		inv.insertItem( cars.racers.Coyot:0x000000EAr ); // F hood 3
		inv.insertItem( cars.racers.Coyot:0x000000FDr ); // R wing 2
		inv.insertItem( cars.racers.Coyot:0x0000010Dr ); // L sideskirt 3
		inv.insertItem( cars.racers.Coyot:0x000000F8r ); // R sideskirt 3
		inv.insertItem( cars.racers.Coyot:0x000000EEr ); // L mirror 3
		inv.insertItem( cars.racers.Coyot:0x000000F2r ); // R mirror 3
	}
}
