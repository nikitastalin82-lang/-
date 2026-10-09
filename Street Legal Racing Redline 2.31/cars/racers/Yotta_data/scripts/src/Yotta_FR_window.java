package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FR_window extends Window
{
	public Yotta_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta passenger's window";
		description = "Stock passenger's window for Yotta models.";

		value = tHUF2USD(75.327);
		brand_new_prestige_value = 26.99;
	}
}
