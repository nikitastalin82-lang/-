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
		name = "ST9 custom body kit";
		description = "Custom body kit for ST9. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.ST9:0x000000DBr ); // F bumper 2
		inv.insertItem( cars.racers.ST9:0x000000DCr ); // hood 2
		inv.insertItem( cars.racers.ST9:0x000000DAr ); // R bumper 2
		inv.insertItem( cars.racers.ST9:0x000000D5r ); // L sideskirt 2
		inv.insertItem( cars.racers.ST9:0x000000DFr ); // R sideskirt 2
		inv.insertItem( cars.racers.ST9:0x000000D8r ); // L mirror 2
		inv.insertItem( cars.racers.ST9:0x000000D9r ); // R mirror 2
	}
}
