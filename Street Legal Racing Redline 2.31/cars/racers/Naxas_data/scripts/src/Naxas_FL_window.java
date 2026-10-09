package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_FL_window extends Window
{
	public Naxas_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas driver's window";
		description = "Stock driver's window for Naxas models.";

		value = tHUF2USD(256.576);
		brand_new_prestige_value = 31.90;
	}
}
