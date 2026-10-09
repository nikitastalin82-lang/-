package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_headlights extends Headlights
{
	public Codrac_R_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock right headlights";
		description = "Stock right headlights for Codrac models.";

		value = tHUF2USD(64.988);
		brand_new_prestige_value = 41.47;
	}
}
