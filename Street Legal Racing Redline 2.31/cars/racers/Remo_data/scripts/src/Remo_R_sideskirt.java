package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_sideskirt extends Sideskirt
{
	public Remo_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock right sideskirt";
		description = "Stock right sideskirt for Remo models.";

		value = tHUF2USD(52.539);
		brand_new_prestige_value = 23.60;
	}
}
