package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_sideskirt extends Sideskirt
{
	public Furrano_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GT54 left sideskirt";
		description = "Stock left sideskirt for the Furrano GT54.";

		value = tHUF2USD(263.75);
		brand_new_prestige_value = 40.46;
	}
}