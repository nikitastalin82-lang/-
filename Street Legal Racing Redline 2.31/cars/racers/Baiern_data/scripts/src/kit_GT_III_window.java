package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GT_III_window extends Set
{
	public kit_GT_III_window( int id )
	{
		super( id );
		name = "Baiern CoupeSport GT III window kit";
		description = "A replacement plastic window kit for Baiern.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.baiern:0x000000FEr ); // FL window 2
		inv.insertItem( cars.racers.baiern:0x000000FFr ); // FR window 2
		inv.insertItem( cars.racers.baiern:0x00000015Ar ); // RL window 2
		inv.insertItem( cars.racers.baiern:0x00000015Br ); // RR window 2
		inv.insertItem( cars.racers.baiern:0x00000015Cr ); // R window 2
	}
}
