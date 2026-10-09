package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_RL_window extends Window
{
	public Yotta_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta rear left window";
		description = "Stock rear left window for Yotta models.";

		value = tHUF2USD(44.521);
		brand_new_prestige_value = 26.99;
	}
}
