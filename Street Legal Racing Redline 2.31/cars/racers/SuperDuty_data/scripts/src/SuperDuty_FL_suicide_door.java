package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_FL_suicide_door extends FrontDoor
{
	public SuperDuty_FL_suicide_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty suicide driver's door";

		description = "The suicide type stock driver's door of the SuperDutys.";

		value = tHUF2USD(251.519);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(400000.0));
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );

		// parts that have only one appearance //
		if ( optical >= 1.0 )
		{
			addPart( cars.racers.superduty:0x000000B7r, "FL window", actcolor, optical, power );
			addPart( cars.racers.superduty:0x000000BAr, "L mirror", actcolor, optical, power );
		} else
		{
			if ( optical >= random() ) addPart( cars.racers.superduty:0x000000B7r, "FL window", actcolor, optical, power );
			if ( optical >= random() ) addPart( cars.racers.superduty:0x000000BAr, "L mirror", actcolor, optical, power );
		}
	}
}
