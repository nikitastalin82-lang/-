package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_window extends Window
{
	public Stallion_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion driver's window";
		description = "Stock driver's window for Stallion models.";

		value = tHUF2USD(43.466);
		brand_new_prestige_value = 26.99;
	}
}
