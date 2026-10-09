package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_L_taillights_dark extends Taillights
{
	public SuperDuty_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty dark left taillights";

		description = "The dark left side taillights for the SuperDuty family. It has four sections: a 20W amber indicator, a 25W/35W red city/brake light, and a bright 35W white reversing light to enlighten the scene enough behind the car.";

		value = tHUF2USD(63.083);
		brand_new_prestige_value = 61.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
