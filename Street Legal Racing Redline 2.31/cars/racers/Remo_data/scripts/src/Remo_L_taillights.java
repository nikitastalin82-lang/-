package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_L_taillights extends Taillights
{
	public Remo_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo left taillights";
		description = "Stock left taillights for Remo models.";

		value = tHUF2USD(66.043);
		brand_new_prestige_value = 20.25;
	}
}
