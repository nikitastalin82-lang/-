package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_RL_window extends Window
{
	public Axis_RL_window( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis rear left window";
		description = "Stock rear left window for Axis models.";

		value = tHUF2USD(67.52);
		brand_new_prestige_value = 24.54;
	}
}
