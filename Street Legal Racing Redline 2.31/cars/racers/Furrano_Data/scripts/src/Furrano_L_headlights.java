package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_headlights extends Headlights
{
	public Furrano_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano left headlights";
		description = "Stock left headlights for Furrano models.";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(164.58);
	}
}