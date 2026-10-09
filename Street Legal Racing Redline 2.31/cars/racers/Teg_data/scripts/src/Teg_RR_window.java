package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_RR_window extends Window
{
	public Teg_RR_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg rear right window";
		description = "Stock rear right window for Teg models.";

		value = tHUF2USD(47.053);
		brand_new_prestige_value = 20.85;
	}
}
