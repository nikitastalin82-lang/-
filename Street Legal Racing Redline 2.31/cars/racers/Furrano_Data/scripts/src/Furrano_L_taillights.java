package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_L_taillights extends Taillights
{
	public Furrano_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano left taillights";
		description = "Stock left taillights for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(138.205);
	}
}