package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_L_headlights extends Headlights
{
	public Stallion_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock left headlights";
		description = "Stock left headlights for Stallion models.";

		value = tHUF2USD(52.75);
		brand_new_prestige_value = 41.47;
	}
}
