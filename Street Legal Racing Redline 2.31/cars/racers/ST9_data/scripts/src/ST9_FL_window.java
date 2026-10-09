package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FL_window extends Window
{
	public ST9_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 driver's window";
		description = "Stock driver's window for ST9 models.";

		value = tHUF2USD(81.657);
		brand_new_prestige_value = 25.76;
	}
}
