package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tourer_body extends Set
{
	public kit_Tourer_body( int id )
	{
		super( id );
		name = "Ninja Tourer body kit";
		description = "Body kit for the Ninja Tourer. Includes front bumper, hood, rear bumper, sideskirts, mirrors, hatch wing and a rear door wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Ninja:0x000000FAr ); // F bumper 3
		inv.insertItem( cars.racers.Ninja:0x00000102r ); // hood 3
		inv.insertItem( cars.racers.Ninja:0x00000101r ); // R bumper 3
		inv.insertItem( cars.racers.Ninja:0x00000104r ); // L sideskirt 3
		inv.insertItem( cars.racers.Ninja:0x00000108r ); // R sideskirt 3
		inv.insertItem( cars.racers.Ninja:0x00000105r ); // L mirror 3
		inv.insertItem( cars.racers.Ninja:0x00000107r ); // R mirror 3
		inv.insertItem( cars.racers.Ninja:0x000000FFr ); // R wing
		inv.insertItem( cars.racers.Ninja:0x00000100r ); // Rf wing
	}
}
