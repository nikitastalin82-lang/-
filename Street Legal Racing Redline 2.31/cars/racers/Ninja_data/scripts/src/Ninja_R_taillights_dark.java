package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_taillights_dark extends Taillights
{
	public Ninja_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja dark right taillights";
		description = "Dark right taillights for Ninja models.";

		value = tHUF2USD(46.943);
		brand_new_prestige_value = 25.70;
	}
}
