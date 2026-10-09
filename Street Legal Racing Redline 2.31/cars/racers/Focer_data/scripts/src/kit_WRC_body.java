package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_WRC_body extends Set
{
	public kit_WRC_body( int id )
	{
		super( id );
		name = "Shimutshibu Focer WRC body kit";
		description = "Complete cross racing kit for Focer, includes widebody quarterpanels, doors, bumpers, sideskirts, roof airduct, rear wing, bright rear and front lights, rally headlights and aerohood.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.focer:0x000000C1r ); // "Rf airduct" //

		inv.insertItem( cars.racers.focer:0x0000F10Cr ); // "L headlights 3" //
		inv.insertItem( cars.racers.focer:0x0000F0AEr ); // "FL quarterpanel 2" //

		inv.insertItem( cars.racers.focer:0x0000F10Dr ); // "R headlights 2" //
		inv.insertItem( cars.racers.focer:0x0000F0B8r ); // "FR quarterpanel 2" //

		inv.insertItem( cars.racers.focer:0x0000F0A5r ); // "L taillights 2" //
		inv.insertItem( cars.racers.focer:0x0000F0B2r ); // "RL quarterpanel 2" //

		inv.insertItem( cars.racers.focer:0x0000F0BBr ); // "R taillights 2" //
		inv.insertItem( cars.racers.focer:0x0000F0B9r ); // "RR quarterpanel 2" //

		inv.insertItem( cars.racers.focer:0x0000F0AFr ); // "F bumper 2" //
		inv.insertItem( cars.racers.focer:0x0000F0A4r ); // "hood 2" //

		inv.insertItem( cars.racers.focer:0x0000F0B3r ); // "R bumper 2" //
		inv.insertItem( cars.racers.focer:0x0000F0C2r ); // "R wing 2" //

		inv.insertItem( cars.racers.focer:0x0000F0B0r ); // "L sideskirt 2" //
		inv.insertItem( cars.racers.focer:0x0000F0B1r ); // "RL door 2" //

		inv.insertItem( cars.racers.focer:0x0000F0BEr ); // "R sideskirt 2" //
		inv.insertItem( cars.racers.focer:0x0000F0B7r ); // "RR door 2" //

		inv.insertItem( cars.racers.focer:0x00000119r ); // rally headlights
	}
}
