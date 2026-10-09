package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_FR_window extends Window
{
	public Furrano_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano passenger's window";
		description = "Stock passenger's window for Furrano models.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(265.016);
	}
}
