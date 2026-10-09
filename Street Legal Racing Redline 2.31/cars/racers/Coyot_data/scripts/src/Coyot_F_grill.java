package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_grill extends GrilleGuard
{
	public Coyot_F_grill( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock grill";
		description = "Stock front grill for Coyot.";

		value = tHUF2USD(28.274);
		brand_new_prestige_value = 18.09;
	}
}
