package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_RL_window extends Window
{
	public Coyot_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot rear left window";
		description = "Stock rear left window for Coyot models.";

		value = tHUF2USD(40.071);
		brand_new_prestige_value = 22.08;
	}
}
