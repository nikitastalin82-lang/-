package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Kurumma_RR_window extends Window
{
	public Kurumma_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Kurumma rear right window";
		description = "Stock right mirror for Kurumma models.";

		value = tHUF2USD(57.603);
		brand_new_prestige_value = 26.99;
	}
}
