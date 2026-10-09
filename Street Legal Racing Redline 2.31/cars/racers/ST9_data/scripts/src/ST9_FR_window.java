package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FR_window extends Window
{
	public ST9_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 passenger's window";
		description = "Stock passenger's window for ST9 models.";

		value = tHUF2USD(81.657);
		brand_new_prestige_value = 25.76;
	}
}
