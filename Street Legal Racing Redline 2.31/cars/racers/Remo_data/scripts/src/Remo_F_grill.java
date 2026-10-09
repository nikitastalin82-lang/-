package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_F_grill extends GrilleGuard
{
	public Remo_F_grill( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo stock front grill";
		description = "Stock front grill for Remo models.";

		value = tHUF2USD(43.466);
		brand_new_prestige_value = 14.07;
	}
}
