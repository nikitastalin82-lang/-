package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_F_grill_2 extends GrilleGuard
{
	public Remo_F_grill_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo custom front grill";
		description = "Custom front grill for Remo models.";

		value = tHUF2USD(102.546);
		brand_new_prestige_value = 17.12;
	}
}
