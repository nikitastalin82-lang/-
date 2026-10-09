package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Baiern_FL_door_3 extends FrontDoor
{
	public Baiern_FL_door_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM driver's door";

		description = "The driver's door of the CoupeSport DTM. It's made of aluminium strenghtened with a steel cage on the inside. It's a little bit wider than door for CoupeSport GTIII to fit the wide rear quarterpanel.";

		value = tHUF2USD(2785.2);
		brand_new_prestige_value = 75.0;
		setMaxWear(kmToMaxWear(400000.0));
	}
}
