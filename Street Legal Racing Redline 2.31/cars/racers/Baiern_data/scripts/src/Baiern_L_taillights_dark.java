package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_L_taillights_dark extends Taillights
{
	public Baiern_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport/DevilSport dark left taillights";

		description = "The dark left side taillights for all DevilSport and CoupeSport models. It has three sections: a 20W red indicator, a 25W/35W red city/brake light, and a bright 35W white reversing light. The city and brake bulbs use LEDs for saftey reasons and long lifetime.";

		value = tHUF2USD(55);
		brand_new_prestige_value = 36.50;
		setMaxWear(kmToMaxWear(300000.0));
	}
}
