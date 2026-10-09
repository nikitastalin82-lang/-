package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_sideskirt_2 extends Sideskirt
{
	public ST9_R_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom right sideskirt";
		description = "Custom right sideskirt for ST9 models.";

		value = tHUF2USD(78.703);
		brand_new_prestige_value = 45.79;
	}
}
