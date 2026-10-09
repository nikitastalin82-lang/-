package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_FR_window extends Window
{
	public Codrac_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac passenger's window";
		description = "Stock passenger's window for Codrac models.";

		value = tHUF2USD(41.989);
		brand_new_prestige_value = 19.63;
	}
}
