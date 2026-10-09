package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_taillights_dark extends Taillights
{
	public Stallion_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion dark right taillights";
		description = "Dark right taillights for Stallion models.";

		value = tHUF2USD(78.593);
		brand_new_prestige_value = 35.82;
	}
}
