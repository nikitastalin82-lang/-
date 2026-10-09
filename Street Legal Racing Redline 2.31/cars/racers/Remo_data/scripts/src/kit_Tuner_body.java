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
		name = "Remo tuning body kit";
		description = "Tuning Body kit for Remo. Includes front bumper with a grill, hood, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Remo:0x000000B6r ); // F bumper 3
		inv.insertItem( cars.racers.Remo:0x000000C1r ); // hood 3
		inv.insertItem( cars.racers.Remo:0x000000B8r ); // grill 2
		inv.insertItem( cars.racers.Remo:0x000000C9r ); // R bumper 3
		inv.insertItem( cars.racers.Remo:0x000000C5r ); // L sideskirt 2
		inv.insertItem( cars.racers.Remo:0x000000CEr ); // R sideskirt 2
	}
}
