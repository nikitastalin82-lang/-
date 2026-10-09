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
		name = "Whisper custom body kit";
		description = "Custom body kit for Whisper. Includes front bumper, hood, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Whisper:0x000000E3r ); // F bumper 2
		inv.insertItem( cars.racers.Whisper:0x000000ECr ); // hood 2
		inv.insertItem( cars.racers.Whisper:0x000000F6r ); // R bumper 2
		inv.insertItem( cars.racers.Whisper:0x000000F2r ); // L sideskirt 2
		inv.insertItem( cars.racers.Whisper:0x000000FAr ); // R sideskirt 2
	}
}
