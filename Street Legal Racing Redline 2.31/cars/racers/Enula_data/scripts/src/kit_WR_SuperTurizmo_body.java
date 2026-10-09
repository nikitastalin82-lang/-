package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_WR_SuperTurizmo_body extends Set
{
	public kit_WR_SuperTurizmo_body( int id )
	{
		super( id );
		name = "Ishima Enula WR SuperTurizmo body kit";
		description = "Cross racing kit for Enula, includes widebody quarterpanels, doors, bumpers, sideskirts, rear wing, rally headlights and aerohood.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.enula:0x0000012Er ); // FL quarterpanel 2
		inv.insertItem( cars.racers.enula:0x0000012Fr ); // FR quarterpanel 2
		inv.insertItem( cars.racers.enula:0x00000135r ); // RL quarterpanel 2
		inv.insertItem( cars.racers.enula:0x00000137r ); // RR quarterpanel 2

		inv.insertItem( cars.racers.enula:0x00000131r ); // L sideskirt 2
		inv.insertItem( cars.racers.enula:0x00000133r ); // R sideskirt 2

		inv.insertItem( cars.racers.enula:0x0000012Dr ); // F bumper 2
		inv.insertItem( cars.racers.enula:0x00000132r ); // R bumper 2

		inv.insertItem( cars.racers.enula:0x00000130r ); // hood 2
		inv.insertItem( cars.racers.enula:0x00000138r ); // R wing 2

		inv.insertItem( cars.racers.enula:0x00000134r ); // RL door 2
		inv.insertItem( cars.racers.enula:0x00000136r ); // RR door 2

		inv.insertItem( cars.racers.enula:0x00000176r ); // rally headlights
	}
}
