package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FR_window extends Window
{
	public Ninja_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja passenger's window";
		description = "Stock passenger's window for Ninja models.";

		value = tHUF2USD(24.687);
		brand_new_prestige_value = 18.40;
	}
}
