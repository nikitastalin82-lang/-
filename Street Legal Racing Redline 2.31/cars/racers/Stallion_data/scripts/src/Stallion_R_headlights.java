package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_headlights extends Headlights
{
	public Stallion_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock right headlights";
		description = "Stock right headlights for Stallion models.";

		value = tHUF2USD(52.75);
		brand_new_prestige_value = 41.47;
	}
}
