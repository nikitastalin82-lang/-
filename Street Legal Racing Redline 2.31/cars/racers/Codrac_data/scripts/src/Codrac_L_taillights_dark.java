package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_L_taillights_dark extends Taillights
{
	public Codrac_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac dark left taillights";
		description = "Dark left taillights for Codrac models.";

		value = tHUF2USD(46.521);
		brand_new_prestige_value = 28.14;
	}
}
