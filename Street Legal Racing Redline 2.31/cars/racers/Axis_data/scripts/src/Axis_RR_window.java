package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_RR_window extends Window
{
	public Axis_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis rear right window";
		description = "Stock right mirror for Axis models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 24.54;
	}
}
