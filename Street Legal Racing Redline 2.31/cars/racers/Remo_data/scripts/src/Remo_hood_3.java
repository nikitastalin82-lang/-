package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_hood_3 extends Hood
{
	public Remo_hood_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo tuner hood";
		description = "Aero hood for Remo models.";

		value = tHUF2USD(390.561);
		brand_new_prestige_value = 35.18;
	}
}
