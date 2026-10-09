package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_sideskirt_2 extends Sideskirt
{
	public Yotta_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom left sideskirt";
		description = "Custom left sideskirt for Yotta models.";

		value = tHUF2USD(94.95);
		brand_new_prestige_value = 47.97;
	}
}
