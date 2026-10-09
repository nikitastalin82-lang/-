package java.game.cars;

import java.game.parts.enginepart.*;


public class Badge_R_external_pipe extends ExhaustTip
{
	public Badge_R_external_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge right muffler";

		description = "External exhaust system for Badge models.";

		value = tHUF2USD(142.847);
		brand_new_prestige_value = 31.82;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
