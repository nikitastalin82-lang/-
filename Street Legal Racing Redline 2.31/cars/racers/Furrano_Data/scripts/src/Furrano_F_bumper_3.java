package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_F_bumper_3 extends Bumper
{
	public Furrano_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano custom front bumper";
		description = "Custom front bumper for Furrano models.";
		brand_new_prestige_value = 60.31;

		value = tHUF2USD(487.41);
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x000000B6r, "L_headlights", actcolor, optical, power );
			addPart( cars.racers.Furrano:0x000000C6r, "R_headlights", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000B6r, "L_headlights", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000C6r, "R_headlights", actcolor, optical, power );
		}
	}
}