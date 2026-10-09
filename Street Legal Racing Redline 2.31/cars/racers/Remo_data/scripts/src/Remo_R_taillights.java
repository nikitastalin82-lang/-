package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_taillights extends Taillights
{
	public Remo_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo right taillights";
		description = "Stock right taillights for Remo models.";

		value = tHUF2USD(66.043);
		brand_new_prestige_value = 20.25;
	}
}
