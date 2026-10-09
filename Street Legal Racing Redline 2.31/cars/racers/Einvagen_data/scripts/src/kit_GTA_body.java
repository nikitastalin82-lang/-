package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GTA_body extends Set
{
	public kit_GTA_body( int id )
	{
		super( id );
		name = "Einvagen GTA body kit";
		description = "Street body kit for Einvagen, includes fender skirts, street bumpers, hatch wing, street headlights and aerohood.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.einvagen:0x0000011Cr ); // FL_fender_skirt
		inv.insertItem( cars.racers.einvagen:0x00000120r ); // FR_fender_skirt
		inv.insertItem( cars.racers.einvagen:0x00000127r ); // RL_fender_skirt
		inv.insertItem( cars.racers.einvagen:0x00000128r ); // RR_fender_skirt
		inv.insertItem( cars.racers.einvagen:0x000000A4r ); // F bumper 3
		inv.insertItem( cars.racers.einvagen:0x0000013Cr ); // R bumper 2
		inv.insertItem( cars.racers.einvagen:0x000000C6r ); // Rf wing
		inv.insertItem( cars.racers.einvagen:0x00000131r ); // L headlights 2
		inv.insertItem( cars.racers.einvagen:0x00000130r ); // R headlights 2
		inv.insertItem( cars.racers.einvagen:0x0000011Br ); // hood 3
	}
}
