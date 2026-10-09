package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_sideskirt extends Sideskirt
{
	public Codrac_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock left sideskirt";
		description = "Stock left sideskirt for Codrac models.";

		value = tHUF2USD(24.265);
		brand_new_prestige_value = 26.98;
	}
}
