package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_sideskirt_2 extends Sideskirt
{
	public Remo_R_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom right sideskirt";
		description = "Stock right sideskirt for Remo models.";

		value = tHUF2USD(91.152);
		brand_new_prestige_value = 30.53;
	}
}
