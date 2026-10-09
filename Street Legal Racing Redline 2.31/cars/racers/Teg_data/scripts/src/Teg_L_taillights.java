package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_L_taillights extends Taillights
{
	public Teg_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg left taillights";
		description = "Stock left taillights for Teg models.";

		value = tHUF2USD(44.521);
		brand_new_prestige_value = 24.59;
	}
}
