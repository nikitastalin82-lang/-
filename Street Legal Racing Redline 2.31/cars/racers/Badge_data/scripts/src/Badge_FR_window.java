package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_window extends Window
{
	public Badge_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge passenger's window";
		description = "Stock passenger's window for the Badge models.";

		value = tHUF2USD(55.071);
		brand_new_prestige_value = 26.99;
	}
}
