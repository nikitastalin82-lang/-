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
		name = "ST9 tuning body kit";
		description = "Tuning body kit for ST9. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.ST9:0x000000E4r ); // F bumper 3
		inv.insertItem( cars.racers.ST9:0x000000E3r ); // hood 3
		inv.insertItem( cars.racers.ST9:0x000000E1r ); // R bumper 3
		inv.insertItem( cars.racers.ST9:0x000000E0r ); // L sideskirt 3
		inv.insertItem( cars.racers.ST9:0x000000E5r ); // R sideskirt 3
		inv.insertItem( cars.racers.ST9:0x000000E2r ); // L mirror 3
		inv.insertItem( cars.racers.ST9:0x000000E6r ); // R mirror 3
	}
}
