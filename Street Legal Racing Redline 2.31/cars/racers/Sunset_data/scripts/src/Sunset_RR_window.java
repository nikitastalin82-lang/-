package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_RR_window extends Window
{
	public Sunset_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset rear right window";
		description = "Stock right mirror for Sunset models.";

		value = tHUF2USD(63.511);
		brand_new_prestige_value = 22.08;
	}
}
