package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_engine_window_2 extends Windshield
{
	public Furrano_engine_window_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GTS engine window";
		description = "Stock engine window for the Furrano GTS.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(250.457);
	}
}