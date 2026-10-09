package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_sideskirt_2 extends Sideskirt
{
	public Remo_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom left sideskirt";
		description = "Stock left sideskirt for Remo models.";

		value = tHUF2USD(91.152);
		brand_new_prestige_value = 30.53;
	}
}
