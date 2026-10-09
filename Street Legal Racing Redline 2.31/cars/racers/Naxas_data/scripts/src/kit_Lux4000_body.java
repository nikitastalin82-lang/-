package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Lux4000_body extends Set
{
	public kit_Lux4000_body( int id )
	{
		super( id );
		name = "Naxas Lux4000 body kit";
		description = "Body kit for Naxas Lux4000. Includes front bumper, hood, rear bumper, sideskirts and mirrors.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Naxas:0x000000CFr ); // F bumper 2
		inv.insertItem( cars.racers.Naxas:0x000000DBr ); // hood 2
		inv.insertItem( cars.racers.Naxas:0x000000F1r ); // R bumper 2
		inv.insertItem( cars.racers.Naxas:0x000000E2r ); // L sideskirt 2
		inv.insertItem( cars.racers.Naxas:0x000000F5r ); // R sideskirt 2
		inv.insertItem( cars.racers.Naxas:0x000000DFr ); // L mirror 2
		inv.insertItem( cars.racers.Naxas:0x000000E6r ); // R mirror 2
	}
}
