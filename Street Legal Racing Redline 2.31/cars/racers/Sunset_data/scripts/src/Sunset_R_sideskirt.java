package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_sideskirt extends Sideskirt
{
	public Sunset_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset E96S right sideskirt";
		description = "Stock right sideskirt for the Sunset E96S.";

		value = tHUF2USD(42.622);
		brand_new_prestige_value = 30.35;
	}
}
