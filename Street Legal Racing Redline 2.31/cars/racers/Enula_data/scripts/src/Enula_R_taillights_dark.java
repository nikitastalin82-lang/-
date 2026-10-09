package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Enula_R_taillights_dark extends Taillights
{
	public Enula_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Enula WR dark right taillights";
		description = "The dark right taillights for the WR models.";

		value = tHUF2USD(42);
		brand_new_prestige_value = 44.47;
	}
}
