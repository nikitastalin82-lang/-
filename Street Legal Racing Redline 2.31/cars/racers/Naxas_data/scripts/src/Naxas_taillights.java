package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_taillights extends Taillights
{
	public Naxas_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas taillights";
		description = "Stock right taillights for Naxas models.";

		value = tHUF2USD(445.21);
		brand_new_prestige_value = 37.61;
	}
}
