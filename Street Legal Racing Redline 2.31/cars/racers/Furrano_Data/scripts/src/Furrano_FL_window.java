package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_FL_window extends Window
{
	public Furrano_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano stock driver's window";
		description = "Stock driver's door for Furrano models.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(265.016);
	}
}