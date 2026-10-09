package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FR_scissor_door extends FrontDoor
{
	public Codrac_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac scissor passenger's door";
		description = "Scissor type passenger's door for Codrac models.";

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
			addPart( cars.racers.Codrac:0x00000107r, "FR window", actcolor, optical, power );
			addPart( cars.racers.Codrac:0x0000013Ar, "R mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Codrac:0x00000107r, "FR window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.Codrac:0x0000013Ar, "R mirror", actcolor, optical, power );
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
