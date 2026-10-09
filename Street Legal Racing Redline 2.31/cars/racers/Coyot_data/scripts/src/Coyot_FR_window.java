package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FR_window extends Window
{
	public Coyot_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot passenger's window";
		description = "Stock passenger's window for Coyot models.";

		value = tHUF2USD(41.989);
		brand_new_prestige_value = 22.08;
	}
}
