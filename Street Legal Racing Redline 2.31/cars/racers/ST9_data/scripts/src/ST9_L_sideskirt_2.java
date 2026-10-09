package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_sideskirt_2 extends Sideskirt
{
	public ST9_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom left sideskirt";
		description = "Custom left sideskirt for ST9 models.";

		value = tHUF2USD(78.703);
		brand_new_prestige_value = 45.79;
	}
}
