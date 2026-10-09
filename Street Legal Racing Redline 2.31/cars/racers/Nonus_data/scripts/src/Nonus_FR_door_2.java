package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_FR_door_2 extends FrontDoor
{
	public Nonus_FR_door_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM front right door";

		description = "A front right door for the Nonus DTM. It was made similiar to ordinary Nonus door, but from the lighter materials and with smoothing in some areas.";

		brand_new_prestige_value = 61.20;

		value = tHUF2USD(2331.55);
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.nonus:0x0000009Br, "R mirror", actcolor, optical, power );
			addPart( cars.racers.nonus:0x000000A4r, "FR window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.nonus:0x0000009Br, "R mirror", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.nonus:0x000000A4r, "FR window", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}

	}
}
