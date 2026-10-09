package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_RL_window extends Window
{
	public Codrac_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac rear left window";
		description = "Stock rear left window for Codrac models.";

		value = tHUF2USD(72.584);
		brand_new_prestige_value = 19.63;
	}
}
