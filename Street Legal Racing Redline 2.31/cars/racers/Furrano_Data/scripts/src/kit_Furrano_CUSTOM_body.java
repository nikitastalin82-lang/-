package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Furrano_CUSTOM_body extends Set
{
	public kit_Furrano_CUSTOM_body( int id )
	{
		super( id );
		name = "Furrano GTS body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Furrano:0x000000C4r ); // F_bumper_2
		inv.insertItem( cars.racers.Furrano:0x000000B9r ); // R_bumper_2

		inv.insertItem( cars.racers.Furrano:0x000000C2r ); // Hood_2
		inv.insertItem( cars.racers.Furrano:0x0000A0B2r ); // Engine_window_2

		inv.insertItem( cars.racers.Furrano:0x000000CDr ); // L_sideskirt_2
		inv.insertItem( cars.racers.Furrano:0x000000CFr ); // R_sideskirt_2

		inv.insertItem( cars.racers.Furrano:0x000000B6r ); // L_headlights
		inv.insertItem( cars.racers.Furrano:0x000000B8r ); // L_taillights
		inv.insertItem( cars.racers.Furrano:0x000000C6r ); // R_headlights
		inv.insertItem( cars.racers.Furrano:0x000000C5r ); // R_taillights
	}
}