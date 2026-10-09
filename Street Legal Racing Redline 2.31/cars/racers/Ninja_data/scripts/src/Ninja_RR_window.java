package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_RR_window extends Window
{
	public Ninja_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja rear right window";
		description = "Stock right mirror for Ninja models.";

		value = tHUF2USD(51.484);
		brand_new_prestige_value = 18.40;
	}
}
