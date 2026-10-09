package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_headlights extends Headlights
{
	public Codrac_L_headlights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock left headlights";
		description = "Stock left headlights for Codrac models.";

		value = tHUF2USD(64.988);
		brand_new_prestige_value = 41.47;
	}
}
