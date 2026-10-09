package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_R_taillights_dark extends Taillights
{
	public Furrano_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano dark right taillights";
		description = "Dark right taillights for Furrano models.";
		brand_new_prestige_value = 38.72;

		value = tHUF2USD(140.205);
	}
}