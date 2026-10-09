package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_sideskirt extends Sideskirt
{
	public Yotta_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock left sideskirt";
		description = "Stock left sideskirt for Yotta models.";

		value = tHUF2USD(68.153);
		brand_new_prestige_value = 37.09;
	}
}
