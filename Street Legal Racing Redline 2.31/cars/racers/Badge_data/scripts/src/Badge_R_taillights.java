package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_taillights extends Taillights
{
	public Badge_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge right taillights";
		description = "Stock right taillights for Badge models.";

		value = tHUF2USD(63.722);
		brand_new_prestige_value = 31.82;
	}
}
