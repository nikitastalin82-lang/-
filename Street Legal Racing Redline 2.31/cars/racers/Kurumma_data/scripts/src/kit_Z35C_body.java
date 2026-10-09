package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Z35C_body extends Set
{
	public kit_Z35C_body( int id )
	{
		super( id );
		name = "Kurumma Z35C body kit";
		description = "Body kit for Kurumma Z35C. Includes front bumper, hood, trunk, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Kurumma:0x000000C7r ); // F bumper 2
		inv.insertItem( cars.racers.Kurumma:0x000000E0r ); // R bumper 2
		inv.insertItem( cars.racers.Kurumma:0x000000D2r ); // hood 2
		inv.insertItem( cars.racers.Kurumma:0x000000DEr ); // trunk 2
		inv.insertItem( cars.racers.Kurumma:0x000000E3r ); // L sideskirt 2
		inv.insertItem( cars.racers.Kurumma:0x000000E5r ); // R sideskirt 2
	}
}