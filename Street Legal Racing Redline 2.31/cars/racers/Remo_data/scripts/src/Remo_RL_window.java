package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_RL_window extends Window
{
	public Remo_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo rear left window";
		description = "Stock rear left window for Remo models.";

		value = tHUF2USD(65.832);
		brand_new_prestige_value = 17.17;
	}
}
