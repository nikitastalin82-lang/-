package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_sideskirt extends Sideskirt
{
	public Teg_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg stock left sideskirt";
		description = "Stock left sideskirt for Teg models.";

		value = tHUF2USD(35.026);
		brand_new_prestige_value = 28.66;
	}
}
