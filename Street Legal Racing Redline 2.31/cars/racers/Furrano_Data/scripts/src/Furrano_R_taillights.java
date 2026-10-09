package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_taillights extends Taillights
{
	public Furrano_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano right taillights";
		description = "Stock right taillights for Furrano models.";
		brand_new_prestige_value = 34.72;

		value = tHUF2USD(138.205);
	}
}