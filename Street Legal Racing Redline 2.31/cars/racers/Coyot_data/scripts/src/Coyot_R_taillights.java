package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_taillights extends Taillights
{
	public Coyot_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot right taillights";
		description = "Stock right taillights for Coyot models.";

		value = tHUF2USD(44.521);
		brand_new_prestige_value = 26.04;
	}
}
