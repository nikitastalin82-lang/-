package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_targa_top extends TargaTop
{
	public Furrano_targa_top( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano targa top";

		description = "Stock targa top for Furrano models.";

		value = tHUF2USD(148.333);
		brand_new_prestige_value = 29.44;
		setMaxWear(kmToMaxWear(285000));
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x00000118r, "Engine_window", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x00000118r, "Engine_window", actcolor, optical, power );
		}
	}
}