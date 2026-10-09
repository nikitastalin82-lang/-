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
		name = "Yotta tuning body kit";
		description = "Tuning body kit for Yotta. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Yotta:0x000000ECr ); // F bumper 3
		inv.insertItem( cars.racers.Yotta:0x000000E6r ); // hood 3
		inv.insertItem( cars.racers.Yotta:0x000000EDr ); // R bumper 3
		inv.insertItem( cars.racers.Yotta:0x000000E8r ); // L sideskirt 3
		inv.insertItem( cars.racers.Yotta:0x000000E7r ); // R sideskirt 3
		inv.insertItem( cars.racers.Yotta:0x000000E9r ); // L mirror 3
		inv.insertItem( cars.racers.Yotta:0x000000EAr ); // R mirror 3
	}
}
