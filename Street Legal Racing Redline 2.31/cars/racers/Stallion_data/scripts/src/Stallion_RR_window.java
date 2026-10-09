package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_RR_window extends Window
{
	public Stallion_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion rear right window";
		description = "Stock right mirror for Stallion models.";

		value = tHUF2USD(69.63);
		brand_new_prestige_value = 26.99;
	}
}
