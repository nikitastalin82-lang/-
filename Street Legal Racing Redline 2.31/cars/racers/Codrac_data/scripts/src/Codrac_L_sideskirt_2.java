package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_sideskirt_2 extends Sideskirt
{
	public Codrac_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom left sideskirt";
		description = "Custom left sideskirt for Codrac models.";

		value = tHUF2USD(75.96);
		brand_new_prestige_value = 34.89;
	}
}
