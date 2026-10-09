package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tuner_body extends Set
{
	public kit_Tuner_body( int id )
	{
		super( id );
		name = "Teg tuning body kit";
		description = "Tuning body kit for Teg. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Teg:0x000000F0r ); // F bumper 3
		inv.insertItem( cars.racers.Teg:0x000000E6r ); // hood 3
		inv.insertItem( cars.racers.Teg:0x000000F2r ); // R bumper 3
		inv.insertItem( cars.racers.Teg:0x000000EEr ); // L mirror 3
		inv.insertItem( cars.racers.Teg:0x000000EFr ); // R mirror 3
		inv.insertItem( cars.racers.Teg:0x000000F1r ); // L sideskirt 3
		inv.insertItem( cars.racers.Teg:0x000000F3r ); // R sideskirt 3
	}
}
