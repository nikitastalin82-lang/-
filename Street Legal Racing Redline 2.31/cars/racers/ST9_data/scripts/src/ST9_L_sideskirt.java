package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_sideskirt extends Sideskirt
{
	public ST9_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock left sideskirt";
		description = "Stock left sideskirt for ST9 models.";

		value = tHUF2USD(62.034);
		brand_new_prestige_value = 35.40;
	}
}
