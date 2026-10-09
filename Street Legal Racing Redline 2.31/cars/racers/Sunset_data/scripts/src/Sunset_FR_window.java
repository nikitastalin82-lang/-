package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FR_window extends Window
{
	public Sunset_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset passenger's window";
		description = "Stock passenger's window for Sunset models.";

		value = tHUF2USD(43.466);
		brand_new_prestige_value = 22.08;
	}
}
