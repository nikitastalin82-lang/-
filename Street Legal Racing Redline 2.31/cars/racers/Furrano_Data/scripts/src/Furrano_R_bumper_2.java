package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_bumper_2 extends Bumper
{
	public Furrano_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GTS rear bumper";
		description = "Stock rear bumper for the Furrano GTS.";
		brand_new_prestige_value = 48.34;

		value = tHUF2USD(110.000);
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x000000B8r, "L_taillights", actcolor, optical, power );
			addPart( cars.racers.Furrano:0x000000C5r, "R_taillights", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000B8r, "L_taillights", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000C5r, "R_taillights", actcolor, optical, power );
		}
	}
}