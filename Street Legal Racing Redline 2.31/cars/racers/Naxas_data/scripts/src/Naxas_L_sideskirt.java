package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_L_sideskirt extends Sideskirt
{
	public Naxas_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas Tornado left sideskirt";
		description = "Stock left sideskirt for the Naxas Tornado.";

		value = tHUF2USD(232.733);
		brand_new_prestige_value = 43.83;
	}
}
