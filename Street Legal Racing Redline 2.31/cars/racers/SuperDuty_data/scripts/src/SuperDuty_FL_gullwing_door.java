package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_FL_gullwing_door extends FrontDoor
{
	public SuperDuty_FL_gullwing_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty gullwing driver's door";

		description = "The gullwing type stock driver's door of the SuperDutys.";

		value = tHUF2USD(333.123);
		brand_new_prestige_value = 70.20;
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
