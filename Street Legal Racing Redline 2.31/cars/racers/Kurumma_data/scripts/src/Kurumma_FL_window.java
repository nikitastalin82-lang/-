package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_FL_window extends Window
{
	public Kurumma_FL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma driver's window";
		description = "Stock driver's window for Kurumma models.";

		value = tHUF2USD(80.813);
		brand_new_prestige_value = 26.99;
	}
}
