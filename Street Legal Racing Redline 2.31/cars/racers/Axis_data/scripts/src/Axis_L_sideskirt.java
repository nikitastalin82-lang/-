package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_sideskirt extends Sideskirt
{
	public Axis_L_sideskirt( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200S left sideskirt";
		description = "The stock left sideskirt for Axis 200S models.";

		value = tHUF2USD(29.797);
		brand_new_prestige_value = 33.72;
	}
}
