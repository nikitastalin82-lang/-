package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_headlights extends Headlights
{
	public Furrano_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano right headlights";
		description = "Stock right headlights for Furrano models.";
		brand_new_prestige_value = 53.89;

		value = tHUF2USD(164.58);
	}
}