package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_F_grill extends GrilleGuard
{
	public Badge_F_grill( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge front grill";
		description = "Metallic grill for Badge models.";

		value = tHUF2USD(50.851);
		brand_new_prestige_value = 15.48;
	}
}
