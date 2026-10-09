package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_sideskirt_2 extends Sideskirt
{
	public Furrano_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GTS left sideskirt";
		description = "Stock left sideskirt for the Furrano GTS.";

		value = tHUF2USD(304.473);
		brand_new_prestige_value = 52.33;
	}
}