package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_taillights extends Taillights
{
	public Axis_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis stock left taillights";
		description = "Stock left taillights for Axis models.";

		value = tHUF2USD(55.071);
		brand_new_prestige_value = 28.93;
	}
}
