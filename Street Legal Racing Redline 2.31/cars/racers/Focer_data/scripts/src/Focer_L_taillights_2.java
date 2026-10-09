package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Focer_L_taillights_2 extends Taillights
{
	public Focer_L_taillights_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Focer WRC left taillights";
		description = "Stock left taillights for the Focer WRC";
		brand_new_prestige_value = 39.45;

		value = tHUF2USD(65.832);
	}
}
