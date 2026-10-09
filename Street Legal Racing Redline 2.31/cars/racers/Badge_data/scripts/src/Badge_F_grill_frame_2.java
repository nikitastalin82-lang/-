package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_grill_frame_2 extends GrilleGuard
{
	public Badge_F_grill_frame_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge custom front grill frame";
		description = "Custom aluminium front grill frame for Badge models.";

		value = tHUF2USD(60.768);
		brand_new_prestige_value = 26.62;
	}
}
