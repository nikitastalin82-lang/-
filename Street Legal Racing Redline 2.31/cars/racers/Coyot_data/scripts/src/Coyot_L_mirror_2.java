package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_mirror_2 extends Mirror
{
	public Coyot_L_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom left mirror";
		description = "Custom left mirror for Coyot models.";

		value = tHUF2USD(65.41);
		brand_new_prestige_value = 31.89;
	}
}
