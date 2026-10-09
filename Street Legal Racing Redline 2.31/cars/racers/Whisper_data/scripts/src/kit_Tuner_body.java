package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.*;
import java.game.parts.*;


public class kit_Tuner_body extends Set
{
	public kit_Tuner_body( int id )
	{
		super( id );
		name = "Whisper tuning body kit";
		description = "Tuning body kit for Whisper. Includes front bumper, hood, rear bumper and sideskirts.";
	}

	public void build( Inventory inv )
	{
		inv.insertItem( cars.racers.Whisper:0x000000E4r ); // F bumper 3
		inv.insertItem( cars.racers.Whisper:0x000000EDr ); // hood 3
		inv.insertItem( cars.racers.Whisper:0x000000F7r ); // R bumper 3
		inv.insertItem( cars.racers.Whisper:0x000000F3r ); // L sideskirt 3
		inv.insertItem( cars.racers.Whisper:0x000000FBr ); // R sideskirt 3
	}
}
