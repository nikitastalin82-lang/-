package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_ExtremeEdition_body extends Set
{
	public kit_ExtremeEdition_body( int id )
	{
		super( id );
		name = "Naxas Extreme Edition body kit";
		description = "Body kit for the Naxas Extreme Edition. Includes front bumper, hood, rear bumper, sideskirts, mirrors and rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Naxas:0x000000D0r ); // F bumper 3
		inv.insertItem( cars.racers.Naxas:0x000000DCr ); // hood 3
		inv.insertItem( cars.racers.Naxas:0x000000F2r ); // R bumper 3
		inv.insertItem( cars.racers.Naxas:0x000000F4r ); // L sideskirt 3
		inv.insertItem( cars.racers.Naxas:0x000000F3r ); // R sideskirt 3
		inv.insertItem( cars.racers.Naxas:0x000000E0r ); // L mirror 3
		inv.insertItem( cars.racers.Naxas:0x000000E7r ); // R mirror 3
		inv.insertItem( cars.racers.Naxas:0x000000E9r ); // R wing
	}
}
