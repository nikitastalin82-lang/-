package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_grill_frame extends GrilleGuard
{
	public Badge_F_grill_frame( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge '67 front grill frame";
		description = "Stock front grill frame for the Badge '67.";

		value = tHUF2USD(20.063);
		brand_new_prestige_value = 22.11;
	}
}
