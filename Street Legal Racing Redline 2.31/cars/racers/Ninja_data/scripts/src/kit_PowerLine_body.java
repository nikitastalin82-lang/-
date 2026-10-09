package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_PowerLine_body extends Set
{
	public kit_PowerLine_body( int id )
	{
		super( id );
		name = "Ninja PowerLine body kit";
		description = "Body kit for Ninja PowerLine series. Includes front bumper, rear bumper, sideskirts, mirrors, hatch wing and a rear door wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Ninja:0x000000FCr ); // F bumper 2
		inv.insertItem( cars.racers.Ninja:0x000000FDr ); // R bumper 2
		inv.insertItem( cars.racers.Ninja:0x000000FBr ); // L sideskirt 2
		inv.insertItem( cars.racers.Ninja:0x00000109r ); // R sideskirt 2
		inv.insertItem( cars.racers.Ninja:0x000000FEr ); // L mirror 2
		inv.insertItem( cars.racers.Ninja:0x00000106r ); // R mirror 2
		inv.insertItem( cars.racers.Ninja:0x000000FFr ); // R wing
		inv.insertItem( cars.racers.Ninja:0x00000100r ); // Rf wing
	}
}
