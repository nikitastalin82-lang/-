package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_200XT_body extends Set
{
	public kit_200XT_body( int id )
	{
		super( id );
		name = "Axis 200XT body kit";
		description = "Body kit for Axis 200XT. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Axis:0x000000CEr ); // F bumper 2
		inv.insertItem( cars.racers.Axis:0x000000D9r ); // hood 2
		inv.insertItem( cars.racers.Axis:0x000000E0r ); // R bumper 2
		inv.insertItem( cars.racers.Axis:0x000000F2r ); // L sideskirt 2
		inv.insertItem( cars.racers.Axis:0x000000EFr ); // R sideskirt 2
		inv.insertItem( cars.racers.Axis:0x000000F4r ); // L mirror 2
		inv.insertItem( cars.racers.Axis:0x000000F5r ); // R mirror 2
		inv.insertItem( cars.racers.Axis:0x000000E6r ); // R wing 
	}
}
