package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_L_sideskirt_2 extends Sideskirt
{
	public Axis_L_sideskirt_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis 200XT left sideskirt";
		description = "The stock left sideskirt for Axis 200XT models.";

		value = tHUF2USD(128.921);
		brand_new_prestige_value = 43.61;
	}
}
