package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Furrano_body extends Set
{
	public kit_Furrano_body( int id )
	{
		super( id );
		name = "Furrano GT54 body kit";
		description = "";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Furrano:0x000000B0r ); // F_bumper
		inv.insertItem( cars.racers.Furrano:0x000000C7r ); // R_bumper

		inv.insertItem( cars.racers.Furrano:0x000000D1r ); // Targa_top
		inv.insertItem( cars.racers.Furrano:0x00000118r ); // R_windshield_hardtop

		inv.insertItem( cars.racers.Furrano:0x000000B5r ); // Hood
		inv.insertItem( cars.racers.Furrano:0x000000B2r ); // Engine_window

		inv.insertItem( cars.racers.Furrano:0x000000CEr ); // L_sideskirt
		inv.insertItem( cars.racers.Furrano:0x000000CCr ); // R_sideskirt

		inv.insertItem( cars.racers.Furrano:0x000000B6r ); // L_headlights
		inv.insertItem( cars.racers.Furrano:0x000000B8r ); // L_taillights
		inv.insertItem( cars.racers.Furrano:0x000000C6r ); // R_headlights
		inv.insertItem( cars.racers.Furrano:0x000000C5r ); // R_taillights
	}
}