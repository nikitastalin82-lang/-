package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_hood_2 extends Hood
{
	public Remo_hood_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom hood";
		description = "Custom hood for Remo models.";

		value = tHUF2USD(219.862);
		brand_new_prestige_value = 28.20;
	}
}
