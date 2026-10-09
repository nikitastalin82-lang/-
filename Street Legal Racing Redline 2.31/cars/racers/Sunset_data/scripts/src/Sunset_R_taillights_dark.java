package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_R_taillights_dark extends Taillights
{
	public Sunset_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset dark right taillights";
		description = "Dark right taillights for Sunset models.";

		value = tHUF2USD(42);
		brand_new_prestige_value = 28.04;
	}
}
