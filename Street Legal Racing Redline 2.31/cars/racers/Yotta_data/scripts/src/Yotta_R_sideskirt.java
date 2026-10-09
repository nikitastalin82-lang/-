package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_sideskirt extends Sideskirt
{
	public Yotta_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta stock right sideskirt";
		description = "Stock right sideskirt for Yotta models.";

		value = tHUF2USD(68.153);
		brand_new_prestige_value = 37.09;
	}
}
