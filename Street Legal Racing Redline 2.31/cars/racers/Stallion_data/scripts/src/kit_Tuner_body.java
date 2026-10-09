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
		name = "Stallion tuning body kit";
		description = "Tuning body kit for Stallion. Includes front bumper, hood, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Stallion:0x000000EFr ); // F bumper 3
		inv.insertItem( cars.racers.Stallion:0x000000F3r ); // hood 3
		inv.insertItem( cars.racers.Stallion:0x000000F0r ); // R bumper 3
		inv.insertItem( cars.racers.Stallion:0x000000F1r ); // L sideskirt 3
		inv.insertItem( cars.racers.Stallion:0x000000F4r ); // R sideskirt 3
	}
}
