package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_taillights_dark extends Taillights
{
	public Duhen_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip dark right taillights";

		description = "The dark right side taillights for all Duhen SunStrip models. It has three sections: a 20W amber indicator, a 25W/35W red city/brake light, and a 25W white reversing light.";

		value = tHUF2USD(23);
		brand_new_prestige_value = 39.12;
		setMaxWear(kmToMaxWear(285000.0));
	}
}
