package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_R_bumper_4 extends Bumper
{
	public Baiern_R_bumper_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM rear bumper";

		description = "The rear bumper for the CoupeSport DTM. It's made of carbon fiber to drastically reduce weight at the rear and increase lifetime while keeping durability. \n It also supports a complicated splitter to stabilize car at the end.";

		value = tHUF2USD(4030.1);
		brand_new_prestige_value = 65.0;
		setMaxWear(kmToMaxWear(600000.0));
	}
}
