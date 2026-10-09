package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_sideskirt extends Sideskirt
{
	public Remo_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock left sideskirt";
		description = "Stock left sideskirt for Remo models.";

		value = tHUF2USD(52.539);
		brand_new_prestige_value = 23.60;
	}
}
