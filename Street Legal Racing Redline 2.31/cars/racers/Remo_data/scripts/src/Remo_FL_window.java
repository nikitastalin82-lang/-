package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FL_window extends Window
{
	public Remo_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo driver's window";
		description = "Stock driver's window for Remo models.";

		value = tHUF2USD(50.64);
		brand_new_prestige_value = 17.17;
	}
}
