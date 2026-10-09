package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_L_headlights_3 extends Headlights
{
	public Nonus_L_headlights_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM left headlights";

		description = "Powered left headlights for the Nonus DTM, ensure good lighting and high reliability.";

		value = tHUF2USD(1097.2);
		brand_new_prestige_value = 51.23;
		setMaxWear(kmToMaxWear(200000));
	}
}
