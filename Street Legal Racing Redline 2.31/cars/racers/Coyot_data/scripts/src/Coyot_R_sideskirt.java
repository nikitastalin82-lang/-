package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_sideskirt extends Sideskirt
{
	public Coyot_R_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock right sideskirt";
		description = "Stock right sideskirt for Coyot models.";

		value = tHUF2USD(42.622);
		brand_new_prestige_value = 30.35;
	}
}
