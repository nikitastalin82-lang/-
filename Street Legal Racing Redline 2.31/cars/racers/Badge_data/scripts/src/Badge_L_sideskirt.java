package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_L_sideskirt extends Sideskirt
{
	public Badge_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge left sideskirt";
		description = "Stock left sideskirt for Badge models";

		value = tHUF2USD(129.132);
		brand_new_prestige_value = 48.62;
	}
}
