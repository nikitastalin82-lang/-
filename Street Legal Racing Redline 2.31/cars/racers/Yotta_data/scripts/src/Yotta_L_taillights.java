package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_L_taillights extends Taillights
{
	public Yotta_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta left taillights";
		description = "Stock left taillights for Yotta models.";

		value = tHUF2USD(66.043);
		brand_new_prestige_value = 31.82;
	}
}
