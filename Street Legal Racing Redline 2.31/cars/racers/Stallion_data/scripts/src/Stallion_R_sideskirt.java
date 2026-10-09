package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_sideskirt extends Sideskirt
{
	public Stallion_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion right sideskirt";
		description = "Stock right sideskirt for Stallion models.";

		value = tHUF2USD(74.272);
		brand_new_prestige_value = 37.09;
	}
}
