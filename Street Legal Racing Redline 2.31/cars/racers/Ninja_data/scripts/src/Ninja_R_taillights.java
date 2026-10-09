package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_R_taillights extends Taillights
{
	public Ninja_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja right taillights";
		description = "Stock right taillights for Ninja models.";

		value = tHUF2USD(44.943);
		brand_new_prestige_value = 21.70;
	}
}
