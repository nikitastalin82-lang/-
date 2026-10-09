package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_taillights extends Taillights
{
	public Codrac_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac left taillights";
		description = "Stock left taillights for Codrac models.";

		value = tHUF2USD(44.521);
		brand_new_prestige_value = 23.14;
	}
}
