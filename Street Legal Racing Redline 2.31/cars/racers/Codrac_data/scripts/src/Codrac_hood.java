package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_hood extends Hood
{
	public Codrac_hood( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock hood";
		description = "Stock hood for Codrac models.";

		value = tHUF2USD(146.645);
		brand_new_prestige_value = 19.63;
	}
}
