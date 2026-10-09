package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_window extends Window
{
	public Axis_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis driver's window";
		description = "The stock driver's window for Axis models.";

		value = tHUF2USD(25.577);
		brand_new_prestige_value = 24.54;
	}
}
