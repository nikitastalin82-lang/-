package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Baiern_FL_suicide_door_2 extends FrontDoor
{
	public Baiern_FL_suicide_door_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport GT III suicide driver's door";

		description = "The suicide type driver's door of the CoupeSport GT III. It's made of aluminium strenghtened with a steel cage on the inside.";

		value = tHUF2USD(483.247);
		brand_new_prestige_value = 70.0;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
