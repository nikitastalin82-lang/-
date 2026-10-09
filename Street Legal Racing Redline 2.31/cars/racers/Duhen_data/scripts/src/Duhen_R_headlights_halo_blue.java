package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Duhen_R_headlights_halo_blue extends Headlights
{
	public Duhen_R_headlights_halo_blue( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Duhen SunStrip right halogen blue headlights";

		description = "The halo blue right headlights for all the SunStrips. A simple dual halogen headlight with 40W city bulbs and 45W for the highway. The indicator is a standard amber bulb.";

		value = tHUF2USD(84.098);
		brand_new_prestige_value = 35.12;
		setMaxWear(kmToMaxWear(285000));
	}
}
