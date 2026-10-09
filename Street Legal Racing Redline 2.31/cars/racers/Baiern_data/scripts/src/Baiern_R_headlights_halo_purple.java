package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_R_headlights_halo_purple extends Headlights
{
	public Baiern_R_headlights_halo_purple( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern halogen purple right headlights";

		description = "The halo purple right side headlights for all DevilSport and CoupeSport models except for the GT III. A dual xenon headlight with 40W city bulbs and 45W for the highway. The indicator is a standard amber bulb.";

		value = tHUF2USD(251);
		brand_new_prestige_value = 32.50;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
