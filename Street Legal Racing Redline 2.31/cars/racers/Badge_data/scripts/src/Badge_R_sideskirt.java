package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_sideskirt extends Sideskirt
{
	public Badge_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge right sideskirt";
		description = "Stock right sideskirt for Badge models.";

		value = tHUF2USD(129.132);
		brand_new_prestige_value = 48.62;
	}
}
