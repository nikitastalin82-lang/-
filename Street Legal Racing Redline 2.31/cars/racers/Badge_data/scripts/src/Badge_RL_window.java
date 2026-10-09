package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_RL_window extends Window
{
	public Badge_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge rear left window";
		description = "Stock rear left window for Badge models.";

		value = tHUF2USD(42.622);
		brand_new_prestige_value = 26.99;
	}
}
