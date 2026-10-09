package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_L_sideskirt_2 extends Sideskirt
{
	public Coyot_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom left sideskirt";
		description = "Custom left sideskirt for Coyot models.";

		value = tHUF2USD(64.988);
		brand_new_prestige_value = 39.25;
	}
}
