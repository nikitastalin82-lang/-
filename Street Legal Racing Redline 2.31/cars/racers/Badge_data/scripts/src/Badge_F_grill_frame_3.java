package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_grill_frame_3 extends GrilleGuard
{
	public Badge_F_grill_frame_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge GTO front grill frame";
		description = "Stock front grill frame for the Badge GTO.";

		value = tHUF2USD(66.887);
		brand_new_prestige_value = 31.35;
	}
}
