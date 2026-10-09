package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Furrano_CUSTOM_body_2 extends Set
{
	public kit_Furrano_CUSTOM_body_2( int id )
	{
		super( id );
		name = "Furrano custom body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Furrano:0x0000A0C4r ); // F_bumper_3
		inv.insertItem( cars.racers.Furrano:0x0000A0B9r ); // R_bumper_3

		inv.insertItem( cars.racers.Furrano:0x000000D1r ); // Targa_top
		inv.insertItem( cars.racers.Furrano:0x00000118r ); // R_windshield_hardtop

		inv.insertItem( cars.racers.Furrano:0x0000A0C2r ); // Hood_3
		inv.insertItem( cars.racers.Furrano:0x000000B2r ); // Engine_window

		inv.insertItem( cars.racers.Furrano:0x0000A0CDr ); // L_sideskirt_3
		inv.insertItem( cars.racers.Furrano:0x0000A0CFr ); // R_sideskirt_3

		inv.insertItem( cars.racers.Furrano:0x000000BCr ); // R_wing

		inv.insertItem( cars.racers.Furrano:0x000000B6r ); // L_headlights
		inv.insertItem( cars.racers.Furrano:0x000000B8r ); // L_taillights
		inv.insertItem( cars.racers.Furrano:0x000000C6r ); // R_headlights
		inv.insertItem( cars.racers.Furrano:0x000000C5r ); // R_taillights
	}
}