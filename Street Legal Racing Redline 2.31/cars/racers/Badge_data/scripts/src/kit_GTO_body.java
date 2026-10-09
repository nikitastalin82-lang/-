package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_GTO_body extends Set
{
	public kit_GTO_body( int id )
	{
		super( id );
		name = "Badge GTO body kit";
		description = "Body kit for Badge GTO. Includes front bumper panel, front grill with frame, front spoiler, hood, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Badge:0x000000F6r); // F bumper_panel
		inv.insertItem( cars.racers.Badge:0x000000E5r); // F grill
		inv.insertItem( cars.racers.Badge:0x000000EAr); // F grill frame 3
		inv.insertItem( cars.racers.Badge:0x000000D7r); // F spoiler 2
		inv.insertItem( cars.racers.Badge:0x000000F5r); // hood 3
		inv.insertItem( cars.racers.Badge:0x000000D8r); // R wing 2
		inv.insertItem( cars.racers.Badge:0x000000EEr); // L mirror 2
		inv.insertItem( cars.racers.Badge:0x000000EFr); // R mirror 2
	}
}
