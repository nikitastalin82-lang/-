package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FL_window extends Window
{
	public Codrac_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac driver's window";
		description = "Stock driver's window for Codrac models.";

		value = tHUF2USD(41.989);
		brand_new_prestige_value = 19.63;
	}
}
