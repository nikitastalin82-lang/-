package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_grill_2 extends GrilleGuard
{
	public Coyot_F_grill_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom grill";
		description = "Custom front grill for Coyot models.";

		value = tHUF2USD(67.942);
		brand_new_prestige_value = 21.19;
	}
}
