package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_hood extends Hood
{
	public Furrano_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GT54 hood";
		description = "Stock hood for the Furrano GT54.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(388.029);
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x000000B2r, "Hood_window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000B2r, "Hood_window", actcolor, optical, power );
		}
	}
}