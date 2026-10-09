package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FL_window extends Window
{
	public Ninja_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja driver's window";
		description = "Stock driver's window for Ninja models.";

		value = tHUF2USD(24.687);
		brand_new_prestige_value = 18.40;
	}
}
