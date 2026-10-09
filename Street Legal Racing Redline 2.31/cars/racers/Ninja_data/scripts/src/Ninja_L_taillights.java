package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_L_taillights extends Taillights
{
	public Ninja_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja left taillights";
		description = "Stock left taillights for Ninja models.";

		value = tHUF2USD(44.943);
		brand_new_prestige_value = 21.70;
	}
}
