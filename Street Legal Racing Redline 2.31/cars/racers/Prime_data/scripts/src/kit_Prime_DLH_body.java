package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Prime_DLH_body extends Set
{
	public kit_Prime_DLH_body( int id )
	{
		super( id );
		name = "Prime DLH 700 body kit";
		description = "Body kit for Prime DLH 700, includes quaterpanels, front spoiler and blower hood.";
	}

	public void build( Inventory inv )
	{
//		inv.insertItem( cars.racers.prime:0x000000C3r ); // radiator

		inv.insertItem( cars.racers.prime:0x000000CDr ); // RL quarterpanel 2
		inv.insertItem( cars.racers.prime:0x000000D0r ); // RR quarterpanel 2

		inv.insertItem( cars.racers.prime:0x000000CAr ); // hood 2

		inv.insertItem( cars.racers.prime:0x000000CEr ); // FL quarterpanel 2
		inv.insertItem( cars.racers.prime:0x000000CFr ); // FR quarterpanel 2

		inv.insertItem( cars.racers.prime:0x0000000CBr ); // F spoiler 2
	}
}
