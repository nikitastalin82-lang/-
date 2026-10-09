package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_taillights_dark extends Taillights
{
	public Ninja_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja dark left taillights";
		description = "Dark left taillights for Ninja models.";

		value = tHUF2USD(46.943);
		brand_new_prestige_value = 25.70;
	}
}
