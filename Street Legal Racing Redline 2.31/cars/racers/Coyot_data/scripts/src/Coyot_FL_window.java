package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FL_window extends Window
{
	public Coyot_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot driver's window";
		description = "Stock driver's window for Coyot models.";

		value = tHUF2USD(41.989);
		brand_new_prestige_value = 22.08;
	}
}
