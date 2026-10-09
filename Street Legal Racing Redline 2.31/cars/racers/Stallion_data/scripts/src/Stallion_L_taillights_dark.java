package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_L_taillights_dark extends Taillights
{
	public Stallion_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion dark left taillights";
		description = "Dark left taillights for Stallion models.";

		value = tHUF2USD(78.593);
		brand_new_prestige_value = 35.82;
	}
}
