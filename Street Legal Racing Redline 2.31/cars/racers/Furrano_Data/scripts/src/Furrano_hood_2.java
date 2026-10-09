package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_hood_2 extends Hood
{
	public Furrano_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GTS hood";
		description = "Stock hood for the Furrano GTS.";
		brand_new_prestige_value = 48.34;

		value = tHUF2USD(445.843);
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x0000A0B2r, "Hood_window_2", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x0000A0B2r, "Hood_window_2", actcolor, optical, power );
		}
	}
}