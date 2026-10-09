package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_L_taillights extends Taillights
{
	public Sunset_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset left taillights";
		description = "Stock left taillights for Sunset models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 26.04;
	}
}
