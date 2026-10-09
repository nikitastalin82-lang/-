package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_RR_window extends Window
{
	public Badge_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge rear right window";
		description = "Stock right mirror for Badge models.";

		value = tHUF2USD(42.622);
		brand_new_prestige_value = 26.99;
	}
}
