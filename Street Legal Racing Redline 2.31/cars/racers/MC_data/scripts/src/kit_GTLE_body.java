package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GTLE_body extends Set
{
	public kit_GTLE_body( int id )
	{
		super( id );
		name = "MC GTLE body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.mc:0x000000BAr ); // F grill frame B
		inv.insertItem( cars.racers.mc:0x000000A9r ); // F splitter
		inv.insertItem( cars.racers.mc:0x0000010Br ); // F bumper 2
		inv.insertItem( cars.racers.mc:0x00000119r ); // hood 2
		inv.insertItem( cars.racers.mc:0x000000ADr ); // trunk
		inv.insertItem( cars.racers.mc:0x000000ABr ); // R wing
	}
}
