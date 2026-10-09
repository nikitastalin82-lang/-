package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_window extends Window
{
	public Teg_FR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg passenger's window";
		description = "Stock passenger's window for Teg models.";

		value = tHUF2USD(28.063);
		brand_new_prestige_value = 20.85;
	}
}
