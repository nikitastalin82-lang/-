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
		name = "Stallion custom body kit";
		description = "Custom body kit for Stallion. Includes front bumper, hood, rear bumper, sideskirts and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Stallion:0x000000DCr ); // F bumper 2
		inv.insertItem( cars.racers.Stallion:0x000000E0r ); // hood 2
		inv.insertItem( cars.racers.Stallion:0x000000DDr ); // R bumper 2
		inv.insertItem( cars.racers.Stallion:0x000000DEr ); // L sideskirt 2
		inv.insertItem( cars.racers.Stallion:0x000000EBr ); // R sideskirt 2
		inv.insertItem( cars.racers.Stallion:0x000000DFr ); // R wing 2
	}
}
