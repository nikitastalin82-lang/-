package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_window extends Window
{
	public Badge_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge driver's window";
		description = "Stock driver's window for Badge models.";

		value = tHUF2USD(55.071);
		brand_new_prestige_value = 26.99;
	}
}
