package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_SuperSport_Turbo_body extends Set
{
	public kit_SuperSport_Turbo_body( int id )
	{
		super( id );
		name = "Codrac SuperSport Turbo body kit";
		description = "Body kit for Codrac SuperSport Turbo. Includes front bumper, hood, rear bumper, sideskirts, mirrors and a rear wing.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Codrac:0x00000126r ); // F bumper 2
		inv.insertItem( cars.racers.Codrac:0x0000010Dr ); // hood 2
		inv.insertItem( cars.racers.Codrac:0x00000127r ); // R bumper 2
		inv.insertItem( cars.racers.Codrac:0x00000128r ); // R wing 2
		inv.insertItem( cars.racers.Codrac:0x0000012Cr ); // L mirror 2
		inv.insertItem( cars.racers.Codrac:0x0000012Br ); // R mirror 2
		inv.insertItem( cars.racers.Codrac:0x0000012Ar ); // L sideskirt 2
		inv.insertItem( cars.racers.Codrac:0x00000129r ); // R sideskirt 2
	}
}
