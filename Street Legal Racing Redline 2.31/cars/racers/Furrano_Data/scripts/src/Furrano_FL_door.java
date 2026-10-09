package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_FL_door extends FrontDoor
{
	public Furrano_FL_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano stock driver's door";
		description = "Stock driver's door for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(327.683);
	}
	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.Furrano:0x000000B7r, "FL_window", actcolor, optical, power );
			addPart( cars.racers.Furrano:0x000000BAr, "L_mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000B7r, "FL_window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.Furrano:0x000000BAr, "L_mirror", actcolor, optical, power );
		}
	}
}