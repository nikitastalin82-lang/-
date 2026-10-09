package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Emer_Nonus_GT2_body extends Set
{
	public kit_Emer_Nonus_GT2_body( int id )
	{
		super( id );
		name = "Emer MotorSport Nonus GT2 body kit";
		description = "Racing body kit for Nonus, includes new widebody quaterpanels, sideskirts, bumpers and racing hood.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.nonus:0x00000082r ); // FL quarterpanel 2
		inv.insertItem( cars.racers.nonus:0x00000086r ); // FR quarterpanel 2
		inv.insertItem( cars.racers.nonus:0x0000010Er ); // RL quarterpanel 2
		inv.insertItem( cars.racers.nonus:0x0000010Dr ); // RR quarterpanel 2

		inv.insertItem( cars.racers.nonus:0x00000123r ); // L sideskirt 2
		inv.insertItem( cars.racers.nonus:0x00000122r ); // R sideskirt 2

		inv.insertItem( cars.racers.nonus:0x0000008Cr ); // F bumper 3
		inv.insertItem( cars.racers.nonus:0x0000010Ar ); // R bumper 3

		inv.insertItem( cars.racers.nonus:0x00000108r ); // hood 2

//		inv.insertItem( cars.racers.nonus:0x0000008Cr ); // FL door 2
//		inv.insertItem( cars.racers.nonus:0x0000010Ar ); // FR door 2
	}
}
