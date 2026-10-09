package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Custom_body extends Set
{
	public kit_Custom_body( int id )
	{
		super( id );
		name = "Teg custom body kit";
		description = "Custom body kit for Teg. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Teg:0x000000E9r ); // F bumper 2
		inv.insertItem( cars.racers.Teg:0x000000F5r ); // hood 2
		inv.insertItem( cars.racers.Teg:0x000000E8r ); // R bumper 2
		inv.insertItem( cars.racers.Teg:0x000000ECr ); // L mirror 2
		inv.insertItem( cars.racers.Teg:0x000000EDr ); // R mirror 2
		inv.insertItem( cars.racers.Teg:0x000000E7r ); // L sideskirt 2
		inv.insertItem( cars.racers.Teg:0x000000EAr ); // R sideskirt 2
	}
}
