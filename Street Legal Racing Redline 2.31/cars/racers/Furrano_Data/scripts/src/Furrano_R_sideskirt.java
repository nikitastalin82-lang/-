package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_sideskirt extends Sideskirt
{
	public Furrano_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GT54 right sideskirt";
		description = "Stock right sideskirt for the Furrano GT54.";

		value = tHUF2USD(263.75);
		brand_new_prestige_value = 40.46;
	}
}