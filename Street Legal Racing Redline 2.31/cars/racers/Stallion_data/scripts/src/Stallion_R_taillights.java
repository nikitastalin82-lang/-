package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_taillights extends Taillights
{
	public Stallion_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion right taillights";
		description = "Stock right taillights for Stallion models.";

		value = tHUF2USD(76.593);
		brand_new_prestige_value = 31.82;
	}
}
