package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_sideskirt_2 extends Sideskirt
{
	public Furrano_R_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GTS right sideskirt";
		description = "Stock right sideskirt for the Furrano GTS.";

		value = tHUF2USD(304.473);
		brand_new_prestige_value = 52.33;
	}
}