package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_taillights extends Taillights
{
	public Yotta_R_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta right taillights";
		description = "Stock right taillights for Yotta models.";

		value = tHUF2USD(66.043);
		brand_new_prestige_value = 31.82;
	}
}
