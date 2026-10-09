package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_taillights extends Taillights
{
	public Codrac_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac right taillights";
		description = "Stock right taillights for Codrac models.";

		value = tHUF2USD(44.521);
		brand_new_prestige_value = 23.14;
	}
}
