package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_F_grill extends GrilleGuard
{
	public Axis_F_grill( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock grill";
		description = "The stock grill for Axis models.";

		value = tHUF2USD(31.65);
		brand_new_prestige_value = 14.07;
	}
}
