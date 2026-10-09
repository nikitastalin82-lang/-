package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_engine_window extends Windshield
{
	public Furrano_engine_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano GT54 engine window";
		description = "Stock engine window for the Furrano GT54.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(177.451);
	}
}