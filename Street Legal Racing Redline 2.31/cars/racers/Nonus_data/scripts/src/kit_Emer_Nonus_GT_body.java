package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Emer_Nonus_GT_body extends Set
{
	public kit_Emer_Nonus_GT_body( int id )
	{
		super( id );
		name = "Emer MotorSport Nonus GT body kit";
		description = "Street body kit for Nonus, includes new sideskirts, bumpers, headlights and street hood.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.nonus:0x00000111r ); // L sideskirt 
		inv.insertItem( cars.racers.nonus:0x00000112r ); // R sideskirt 

		inv.insertItem( cars.racers.nonus:0x00000081r ); // F bumper 2
		inv.insertItem( cars.racers.nonus:0x00000109r ); // R bumper 2

		inv.insertItem( cars.racers.nonus:0x00000106r ); // hood 3

		inv.insertItem( cars.racers.nonus:0x000000E1r ); // L headlights 2
		inv.insertItem( cars.racers.nonus:0x000000E2r ); // R headlights 2
	}
}