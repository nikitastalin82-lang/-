package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_E001SL_body extends Set
{
	public kit_E001SL_body( int id )
	{
		super( id );
		name = "Sunset E001SL body kit";
		description = "Body kit for Sunset E001SL. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Sunset:0x000000FBr ); // F bumper 3
		inv.insertItem( cars.racers.Sunset:0x0000011Fr ); // hood 3
		inv.insertItem( cars.racers.Sunset:0x00000118r ); // R bumper 3
		inv.insertItem( cars.racers.Sunset:0x00000109r ); // L sideskirt 3
		inv.insertItem( cars.racers.Sunset:0x0000010Er ); // R sideskirt 3
		inv.insertItem( cars.racers.Sunset:0x00000114r ); // L mirror 3
		inv.insertItem( cars.racers.Sunset:0x00000117r ); // R mirror 3
		inv.insertItem( cars.racers.Sunset:0x000000F3r ); // R wing 
	}
}
