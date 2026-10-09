package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FL_scissor_door extends FrontDoor
{
	public Codrac_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac scissor driver's door";
		description = "Scissor type driver's door for Codrac models.";

		value = tHUF2USD(113.874);
		brand_new_prestige_value = 56.21;
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
/*
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Codrac:0x0000010Ar, "FL window", actcolor, optical, power );
			addPart( cars.racers.Codrac:0x00000139r, "L mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Codrac:0x0000010Ar, "FL window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.Codrac:0x00000139r, "L mirror", actcolor, optical, power );
		}

		// parts that have multiple appearance //
		if ( optical <= 1.0 )
		{
		} else
		{

		}
*/		

	}
}
