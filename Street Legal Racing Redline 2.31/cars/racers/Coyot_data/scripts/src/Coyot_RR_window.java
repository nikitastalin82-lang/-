package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_RR_window extends Window
{
	public Coyot_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot rear right window";
		description = "Stock right mirror for Coyot models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 22.08;
	}
}
